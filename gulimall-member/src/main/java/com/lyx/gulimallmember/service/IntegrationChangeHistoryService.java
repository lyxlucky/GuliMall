package com.lyx.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyx.common.utils.PageUtils;
import com.lyx.gulimallmember.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author liao
 * @email 2414690715from36@gmail.com
 * @date 2023-07-13 15:05:53
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

