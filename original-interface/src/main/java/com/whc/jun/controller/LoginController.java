package com.whc.jun.controller;

import com.wang.jun.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

  @RequestMapping("/subLogin")
  public String doAuthentication(User user) {
    return "index";
  }
}
