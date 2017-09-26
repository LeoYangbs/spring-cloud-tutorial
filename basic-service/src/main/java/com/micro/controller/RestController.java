package com.micro.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by LeoYang on 2017/9/23.
 */
@SuppressWarnings("all")
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Value("${project_name}")
    private String project_name;
    @Value("${currenct_service}")
    private String currenct_service;

    /**
     * 获取远程配置仓库的属性值 Demo
     * @return
     */
    @GetMapping(value = "/v1/micro/services/basic/fetch-config")
    public ResponseEntity<String> fetchConfig() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("project_name ",project_name);
        jsonObject.put("currenct_service ",currenct_service);
        return new ResponseEntity<String>(jsonObject.toJSONString(), HttpStatus.OK);
    }

}
