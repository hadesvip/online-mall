package com.kevin.onlina.mall.order;

import com.alibaba.cola.dto.Response;
import com.kevin.online.mall.common.service.BaseService;
import com.kevin.online.mall.order.api.OrderServiceI;
import com.kevin.online.mall.order.dto.OrderAddCmd;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单服务实现
 *
 * @author kevin
 */
@RestController
@Slf4j
@AllArgsConstructor
public class OrderServiceImpl extends BaseService implements OrderServiceI {


  @Override
  public ResponseEntity<Response> saveOrder(OrderAddCmd orderAddCmd) {


    return null;
  }
}
