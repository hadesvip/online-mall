package com.kevin.onlina.mall.order.executor;

import com.alibaba.cola.dto.Response;
import com.kevin.online.mall.order.dto.OrderAddCmd;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author kevin
 */
@Component
@Slf4j
public class OrderAddCmdExe {


  public Response execute(OrderAddCmd orderAddCmd) {
    logger.info("执行订单新增指令，请求参数:{}", orderAddCmd);
    //校验



    return Response.buildSuccess();
  }

}
