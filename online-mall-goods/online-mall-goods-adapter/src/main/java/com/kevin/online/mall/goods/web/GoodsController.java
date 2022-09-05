package com.kevin.online.mall.goods.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品API
 *
 * @author kevin
 */
@Slf4j
@RestController
public class GoodsController {


  @Value("${server.port}")
  private String applicationServerPort;


  @GetMapping("/goods/{goodsId}")
  public String goodsDetail(@PathVariable("goodsId") int goodsId) {
    // 根据id查询商品并返回给调用端
    if (goodsId < 1 || goodsId > 100000) {
      return "查询商品为空，当前服务的端口号为" + applicationServerPort;
    }
    String goodsName = "商品" + goodsId;
    // 返回信息给调用端
    return goodsName + "，当前服务的端口号为" + applicationServerPort;
  }


}
