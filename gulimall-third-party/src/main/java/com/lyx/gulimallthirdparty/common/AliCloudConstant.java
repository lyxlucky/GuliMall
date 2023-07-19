package com.lyx.gulimallthirdparty.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author liao
 * @date 2023/7/16 18:53
 */
@Component
@ConfigurationProperties(prefix = "alibaba.cloud.oss")
@Data
public class AliCloudConstant {

    private String accessKey;

    private String secretKey;

    private String endpoint;

}
