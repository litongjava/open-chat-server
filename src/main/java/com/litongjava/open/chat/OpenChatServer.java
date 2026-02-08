package com.litongjava.open.chat;

import com.litongjava.annotation.AComponentScan;
import com.litongjava.open.chat.config.OpenChatServerConfig;
import com.litongjava.tio.boot.TioApplication;

@AComponentScan("com.litongjava.open.chat.controller")
public class OpenChatServer {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    TioApplication.run(OpenChatServer.class, new OpenChatServerConfig(), args);
    long end = System.currentTimeMillis();
    System.out.println((end - start) + "ms");
  }
}
