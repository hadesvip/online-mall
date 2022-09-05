package com.kevin.online.mall.goods;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO 用一句话描述这个类的作用
 *
 * @author kevin
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.kevin.online.mall.goods",
    "com.kevin.online.mall.common"})
public class OnlineMallGoodsApplication {

  public static void main(String[] args) {
    logger.info("Begin to start Spring Boot Application");
    long startTime = System.currentTimeMillis();

    SpringApplication.run(OnlineMallGoodsApplication.class, args);

    long endTime = System.currentTimeMillis();
    logger.info("End starting Spring Boot Application, Time used: " + (endTime - startTime));
  }

}
