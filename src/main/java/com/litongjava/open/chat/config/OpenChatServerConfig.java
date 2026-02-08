package com.litongjava.open.chat.config;

import com.litongjava.context.BootConfiguration;

public class OpenChatServerConfig implements BootConfiguration {

  @Override
  public void config() {
    new HttpRequestHanlderConfig().config();
    new EnjoyEngineConfig().config();
    new DbConfig().config();
  }
}
