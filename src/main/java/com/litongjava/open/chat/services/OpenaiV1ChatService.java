package com.litongjava.open.chat.services;

import com.alibaba.fastjson2.JSONObject;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OpenaiV1ChatService {

  public JSONObject beforeCompletions(JSONObject openAiRequestVo) {
    // JSONArray jsonArray = openAiRequestVo.getJSONArray("messages");
    return openAiRequestVo;
  }

  public String processLine(String line) {
//    log.info("line:{}", line);
    return line;
  }

  public void completionContent(StringBuffer completionContent) {
    log.info("completionContent:{}", completionContent);
  }

  public String functionCall(StringBuffer fnCallName, StringBuffer fnCallArgs) {
    log.info("fn:{},{}", fnCallName.toString(), fnCallArgs.toString());
    return null;

  }

}
