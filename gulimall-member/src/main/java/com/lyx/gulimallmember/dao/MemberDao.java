package com.lyx.gulimallmember.dao;

import com.lyx.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liao
 * @email 2414690715from36@gmail.com
 * @date 2023-07-13 15:05:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
