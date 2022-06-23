package com.codercheng.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description:
 * @Author CoderCheng
 * @Date 2022-06-23 09:36
 * @Version V1.0
 **/
@RestController
public class TestController {

    @RequestMapping("test01")
    public void test01() {

        System.out.println("返回信息");
    }

}
