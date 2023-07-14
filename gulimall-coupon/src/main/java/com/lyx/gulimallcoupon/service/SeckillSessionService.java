package com.lyx.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyx.common.utils.PageUtils;
import com.lyx.gulimallcoupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author liao
 * @email 2414690715from36@gmail.com
 * @date 2023-07-13 14:32:01
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

