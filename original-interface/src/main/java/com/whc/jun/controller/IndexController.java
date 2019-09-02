package com.whc.jun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

  @RequestMapping("/index")
  public String index() {
    return "index";
  }

  @RequestMapping("/login")
  public String login() {
    return "login";
  }

  @RequestMapping("/testCostTimeRequest")
  @ResponseBody
  public String testCostTimeRequest() {
    String result =
        "This request will cost a lot of time, but it will be returned as fast as soon!";
    return result;
  }
}
