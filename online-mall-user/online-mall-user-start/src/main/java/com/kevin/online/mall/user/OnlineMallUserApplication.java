package com.kevin.online.mall.user;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kevin
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.kevin.online.mall.user",
    "com.kevin.online.mall.common"})
public class OnlineMallUserApplication {

  public static void main(String[] args) {
    logger.info("Begin to start Spring Boot Application");
    long startTime = System.currentTimeMillis();

    SpringApplication.run(OnlineMallUserApplication.class, args);

    long endTime = System.currentTimeMillis();
    logger.info("End starting Spring Boot Application, Time used: " + (endTime - startTime));
  }

}
