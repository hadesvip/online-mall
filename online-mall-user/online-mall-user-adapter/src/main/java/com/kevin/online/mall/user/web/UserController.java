package com.kevin.online.mall.user.web;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author kevin
 */
@Slf4j
@RestController
public class UserController {

  @Value("${server.port}")
  private String applicationServerPort;

  private final String ONLINE_MALL_SERVICE_URL = "http://online-mall";

  @Resource
  private RestTemplate restTemplate;

  @GetMapping("/userServiceTest")
  public String userServiceTest() {
    // 返回信息给调用端
    return "this is online-mall-user from port:" + applicationServerPort;
  }


  @GetMapping("/conumeOnlineMall")
  public String consumerOnlineMall() {
    return restTemplate.getForObject(ONLINE_MALL_SERVICE_URL + "/goodsServiceTest", String.class);
  }
}
