package com.liangjiaxian.secondhand;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "校园二手交易平台后端服务正式运行！";
    }

    @GetMapping("/status")
    public String status() {
        return "服务状态：正常 | 时间：" + new java.util.Date();
    }
}