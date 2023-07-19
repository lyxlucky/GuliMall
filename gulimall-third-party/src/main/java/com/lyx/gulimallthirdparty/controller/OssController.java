package com.lyx.gulimallthirdparty.controller;

import com.aliyun.oss.OSS;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import com.lyx.common.utils.R;
import com.lyx.gulimallthirdparty.utils.OssUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author liao
 * @date 2023/7/16 9:47
 */
@RestController
@RequestMapping("/thirdparty")
public class OssController {

    @GetMapping("/oss/policy")
    public R policy() {
        Map<String, String> respMap = OssUtils.policyUpload();
        return R.ok().put("data",respMap);
    }

}
