package com.lyx.gulimallthirdparty.common;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author liao
 * @date 2023/7/15 15:38
 */
//@ConfigurationProperties(prefix = "b2cloud")
//@Component
//@Data
public class B2CloudConstant {

    private String applicationKeyId;

    private String applicationKey;

    private String bucketId;

}
