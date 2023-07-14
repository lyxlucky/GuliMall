package com.lyx.gulimallproduct.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyx.common.utils.PageUtils;
import com.lyx.common.utils.Query;

import com.lyx.gulimallproduct.dao.CategoryDao;
import com.lyx.gulimallproduct.entity.CategoryEntity;
import com.lyx.gulimallproduct.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 查出所有分类
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {

        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        List<CategoryEntity> level1Menu = categoryEntities.stream().filter(
                (item) -> item.getParentCid() == 0
        ).map((menu)  -> {
            menu.setChildren(getChildrens(menu,categoryEntities));
            return menu;
        }).sorted((menu1,menu2) -> {
            return menu1.getSort() - menu2.getSort();
        }).collect(Collectors.toList());

        return level1Menu;
    }

    /**
     * 递归查找当前菜单的子菜单
     * @param root
     * @param all
     * @return
     */
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> list = all.stream().filter((item) -> {
            return item.getParentCid() == root.getCatId();
        }).map(item -> {
            //递归找子菜单
            item.setChildren(getChildrens(item, all));
            return item;
        }).sorted((menu1, menu2) -> {
            //排序
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return list;
    }

    @Override
    public void removeMenuByIds(List<Long> list) {
        //TODO 删除之前先检查
        baseMapper.deleteBatchIds(list);
    }
}