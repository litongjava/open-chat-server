package com.litongjava.open.chat.controller;

import java.io.IOException;

import com.litongjava.annotation.RequestPath;
import com.litongjava.model.body.RespBodyVo;
import com.litongjava.tio.utils.commandline.ProcessResult;
import com.litongjava.yt.utils.YtDlpUtils;

import lombok.extern.slf4j.Slf4j;

@RequestPath("/youtube")
@Slf4j
public class YoutubeController {

  public RespBodyVo download(String id) {
    try {
      ProcessResult downloadMp3 = YtDlpUtils.downloadMp3(id, false);
      log.info("download reuslt:{}", downloadMp3);
    } catch (IOException | InterruptedException e) {
      log.error(e.getMessage(), e);
    }
    return RespBodyVo.ok();
  }
}
