package com.liangjiaxian.secondhand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 核心注解：标记这是Spring Boot主应用
public class SecondHandApplication {
    public static void main(String[] args) {
        // 启动Spring Boot应用
        SpringApplication.run(SecondHandApplication.class, args);
        System.out.println("✅ 校园二手交易平台后端服务启动成功！");
    }
}