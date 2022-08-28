package com.kevin.online.mall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动入口
 *
 * @author kevin
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.kevin.online.mall"})
public class OnlineMallApplication {


  public static void main(String[] args) {
    logger.info("Begin to start Spring Boot Application");
    long startTime = System.currentTimeMillis();

    SpringApplication.run(OnlineMallApplication.class, args);

    long endTime = System.currentTimeMillis();
    logger.info("End starting Spring Boot Application, Time used: " + (endTime - startTime));

  }

}
