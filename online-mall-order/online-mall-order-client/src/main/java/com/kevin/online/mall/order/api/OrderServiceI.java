package com.kevin.online.mall.order.api;

import com.alibaba.cola.dto.Response;
import com.kevin.online.mall.order.dto.OrderAddCmd;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 订单服务
 *
 * @author kevin
 */
@FeignClient(value = "online-mall-order", path = "/order")
public interface OrderServiceI {


  /**
   * 添加订单
   *
   * @param orderAddCmd 订单指令参数
   * @return 执行结果
   */
  @PostMapping("/saveOrder")
  ResponseEntity<Response> saveOrder(@RequestBody OrderAddCmd orderAddCmd);


}
