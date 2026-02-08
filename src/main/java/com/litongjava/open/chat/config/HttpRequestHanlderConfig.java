package com.litongjava.open.chat.config;

import com.litongjava.open.chat.handler.DownloadHandler;
import com.litongjava.tio.boot.server.TioBootServer;
import com.litongjava.tio.http.server.router.HttpRequestRouter;

public class HttpRequestHanlderConfig {

  public void config() {
    // 获取router
    HttpRequestRouter r = TioBootServer.me().getRequestRouter();

    DownloadHandler downloadHandler = new DownloadHandler();
    r.add("/download", downloadHandler);

  }
}
