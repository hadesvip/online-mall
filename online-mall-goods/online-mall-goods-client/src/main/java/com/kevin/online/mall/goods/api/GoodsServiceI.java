package com.kevin.online.mall.goods.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 商品服务
 *
 * @author kevin
 */
@FeignClient(value = "newbee-cloud-shopcart", path = "/shop-cart")
public interface GoodsServiceI {

  @GetMapping(value = "/{cartId}")
  String getCartItem(@PathVariable(value = "cartId") int cartId);

}
