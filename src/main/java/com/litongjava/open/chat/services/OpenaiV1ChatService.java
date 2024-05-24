package com.litongjava.open.chat.services;

import com.alibaba.fastjson2.JSONObject;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OpenaiV1ChatService {

  public JSONObject beforeCompletions(JSONObject openAiRequestVo) {
    return openAiRequestVo;
  }

  public String processLine(String line) {
    log.info("line:{}", line);
    return line;
  }

  public void complectionContent(StringBuffer complectionContent) {
    
    log.info("complectionContent:{}", complectionContent);
    
  }

}
