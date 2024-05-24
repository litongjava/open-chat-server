package com.litongjava.open.chat.config;

import com.litongjava.tio.boot.context.TioBootConfiguration;

public class OpenChatServerConfig implements TioBootConfiguration {

  @Override
  public void config() {
    new ExecutorServiceConfig().config();
    new HttpRequestHanlderConfig().config();
  }
}
