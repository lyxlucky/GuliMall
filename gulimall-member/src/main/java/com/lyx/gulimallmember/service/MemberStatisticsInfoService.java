package com.lyx.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyx.common.utils.PageUtils;
import com.lyx.gulimallmember.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author liao
 * @email 2414690715from36@gmail.com
 * @date 2023-07-13 15:05:53
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

