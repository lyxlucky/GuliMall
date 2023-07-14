package com.lyx.gulimallorder.dao;

import com.lyx.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liao
 * @email 2414690715from36@gmail.com
 * @date 2023-07-13 15:09:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
