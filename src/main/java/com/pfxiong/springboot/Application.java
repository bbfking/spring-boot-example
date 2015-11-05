package com.pfxiong.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    private static Logger logger = LogManager.getLogger(Application.class);// 日志
    @RequestMapping("/")
    public String home() {
        logger.info("get home");
        return "Hello spring boot";
    }

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
