package com.sgr.springboot.lab24.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

// 此注解添加在POJO类，声明该类的信息，在Swagger中将POJO类当做Model类
@ApiModel("用户添加 DTO")
public class UserAddDTO {
    @ApiModelProperty(value = "账号", required = true, example = "雨落川")
    private String username;
    @ApiModelProperty(value = "密码", required = true, example = "admin")
    private String password;

    public String getUsername() {
        return username;
    }

    public UserAddDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserAddDTO setPassword(String password) {
        this.password = password;
        return this;
    }

}
