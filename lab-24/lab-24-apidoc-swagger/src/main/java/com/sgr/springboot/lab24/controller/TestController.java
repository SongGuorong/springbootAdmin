package com.sgr.springboot.lab24.controller;


import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.InputStream;


@Controller
@Api(tags = "测试跨域接口")
public class TestController {

    @GetMapping("/getMenuInfo")
    @ResponseBody
    public JSONObject getMenuInfo() {
        JSONObject json = null;
        try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("adminMenu.json");) {
            json = JSONObject.parseObject(IOUtils.toString(inputStream, "utf-8"));
        } catch (Exception e) {
            System.out.println("读取异常"+e);
        }
        return json;
    }
}
