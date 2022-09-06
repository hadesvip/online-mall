package com.kevin.online.mall.order.dto.data;

import lombok.Data;

/**
 * 订单
 *
 * @author kevin
 */
@Data
public class OrderDTO {

  /**
   * 用户ID
   */
  private Integer userId;

  /**
   * 购物车ID
   */
  private Integer cartId;

  /**
   * 商品ID
   */
  private String goodsId;


  @Override
  public String toString() {
    return "{"
        + "\"userId\":"
        + userId
        + ",\"cartId\":"
        + cartId
        + ",\"goodsId\":\""
        + goodsId + '\"'
        + '}';
  }
}
