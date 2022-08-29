package com.kevin.online.mall.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单
 *
 * @author kevin
 */
@Slf4j
@RestController
public class OrderController {


  @Value("${server.port}")
  private String applicationServerPort;

  @GetMapping("/goodsServiceTest")
  public String goodsServiceTest() {
    // 返回信息给调用端
    return "this is goodsService from port:" + applicationServerPort;
  }


}
