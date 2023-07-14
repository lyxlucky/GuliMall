package com.lyx.gulimallproduct.dao;

import com.lyx.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liao
 * @email 2414690715from36@gmail.com
 * @date 2023-07-13 13:48:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
