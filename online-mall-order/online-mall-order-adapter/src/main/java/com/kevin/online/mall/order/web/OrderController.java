package com.kevin.online.mall.order.web;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * order API
 *
 * @author kevin
 */
@Slf4j
@RestController
public class OrderController {


  @Resource
  private RestTemplate restTemplate;

  // 商品服务调用地址
  private final String ONLINE_MALL_GOODS_URL = "http://online-mall-goods";

  // 购物车服务调用地址
  private final String ONLINE_MALL_GOODS_SHOPCART_URL = "http://online-mall-shopcart";

  @GetMapping("/order/saveOrder")
  public String saveOrder(@RequestParam("cartId") int cartId,
      @RequestParam("goodsId") int goodsId) {
    // 简单的模拟下单流程，包括服务间的调用流程。后续openfeign相关的改造和优化将基于当前项目进行改造。

    // 调用商品服务
    String goodsResult = restTemplate.getForObject(ONLINE_MALL_GOODS_URL + "/goods/" + goodsId,
        String.class);

    // 调用购物车服务
    String cartResult = restTemplate.getForObject(
        ONLINE_MALL_GOODS_SHOPCART_URL + "/shop-cart/" + cartId, String.class);

    // 执行下单逻辑

    return "success! goodsResult={" + goodsResult + "},cartResult={" + cartResult + "}";
  }


}
