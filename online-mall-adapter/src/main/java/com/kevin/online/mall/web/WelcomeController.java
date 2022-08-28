package com.kevin.online.mall.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * hello
 *
 * @author kevin
 */
@Slf4j
@Controller
public class WelcomeController {


  @GetMapping("/welcome")
  @ResponseBody
  public String welcome() {
    return "online-mall application start success!";
  }


}
