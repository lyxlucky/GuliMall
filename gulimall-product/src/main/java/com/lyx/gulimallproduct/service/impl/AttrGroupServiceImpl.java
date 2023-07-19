package com.lyx.gulimallproduct.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyx.common.utils.PageUtils;
import com.lyx.common.utils.Query;

import com.lyx.gulimallproduct.dao.AttrGroupDao;
import com.lyx.gulimallproduct.entity.AttrGroupEntity;
import com.lyx.gulimallproduct.service.AttrGroupService;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Long catelogId) {
        IPage<AttrGroupEntity> page = null;
        if(catelogId == 0){
           page = this.page(
                    new Query<AttrGroupEntity>().getPage(params),
                    new QueryWrapper<AttrGroupEntity>()
            );
        }else{
            String key = params.get("key").toString();
            //select * from pms_attr_group
            QueryWrapper<AttrGroupEntity> queryWrapper = new QueryWrapper<AttrGroupEntity>()
                    .eq("catelog_id",catelogId);
            if(StringUtils.isNoneBlank(key)){
                queryWrapper.and((obj)->{
                    obj.eq("attr_group_id",key).or().like("attr_group_name",key);
                });
            }
            page = this.page(
                    new Query<AttrGroupEntity>().getPage(params),
                    queryWrapper);
        }
        return new PageUtils(page);
    }
}