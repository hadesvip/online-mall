package com.kevin.online.mall.shop.cart.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO 用一句话描述这个类的作用
 *
 * @author kevin
 */
@Slf4j
@RestController
public class ShopCartController {


  @Value("${server.port}")
  private String applicationServerPort;


  @GetMapping("/shopCartTest")
  public String userServiceTest() {
    // 返回信息给调用端
    return "this is online-mall-shopcart from port:" + applicationServerPort;
  }
}
