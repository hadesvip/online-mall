package com.kevin.online.mall.order.dto;

import com.kevin.online.mall.order.dto.data.OrderDTO;
import lombok.Data;

/**
 * 添加订单指令
 *
 * @author kevin
 */
@Data
public class OrderAddCmd {

  /**
   * 订单
   */
  private OrderDTO orderDTO;


  @Override
  public String toString() {
    return "{"
        + "\"orderDTO\":"
        + orderDTO
        + '}';
  }
}
