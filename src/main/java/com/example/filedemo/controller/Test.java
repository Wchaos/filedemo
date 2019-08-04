package com.example.filedemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchao
 * @date 2019/7/21
 */
@RestController
public class Test {

    @RequestMapping("hello")
    public String hello(){
        return "index";
    }
}
