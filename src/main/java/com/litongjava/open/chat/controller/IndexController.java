package com.litongjava.open.chat.controller;

import com.litongjava.tio.http.server.annotation.RequestPath;

@RequestPath("/")
public class IndexController {
  @RequestPath()
  public String index() {
    return "index";
  }
}

