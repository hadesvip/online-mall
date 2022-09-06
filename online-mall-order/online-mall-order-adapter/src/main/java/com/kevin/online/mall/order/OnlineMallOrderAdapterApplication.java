package com.kevin.online.mall.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 程序入口
 *
 * @author kevin
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.kevin.online.mall.order",
        "com.kevin.online.mall.common"})
@EnableFeignClients(basePackages = {"com.kevin.online.mall.order.api"})
public class OnlineMallOrderAdapterApplication {
    public static void main(String[] args) {
        logger.info("Begin to start Spring Boot Application");
        long startTime = System.currentTimeMillis();
        SpringApplication.run(OnlineMallOrderAdapterApplication.class, args);
        long endTime = System.currentTimeMillis();
        logger.info("End starting Spring Boot Application, Time used: " + (endTime - startTime));
    }

}
