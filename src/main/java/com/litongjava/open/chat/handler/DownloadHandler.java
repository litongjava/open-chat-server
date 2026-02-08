package com.litongjava.open.chat.handler;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.litongjava.model.http.response.ResponseVo;
import com.litongjava.tio.boot.http.TioRequestContext;
import com.litongjava.tio.http.common.HttpRequest;
import com.litongjava.tio.http.common.HttpResponse;
import com.litongjava.tio.http.server.handler.HttpRequestHandler;
import com.litongjava.tio.utils.http.ContentTypeUtils;
import com.litongjava.tio.utils.http.HttpUtils;
import com.litongjava.tio.utils.hutool.FilenameUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DownloadHandler implements HttpRequestHandler {

  @Override
  public HttpResponse handle(HttpRequest httpRequest) throws Exception {
    String url = httpRequest.getParam("url");
    log.info("downloading:{}", url);
    ResponseVo responseVo = HttpUtils.download(url);
    String filename = FilenameUtils.getFilename(url);
    HttpResponse response = TioRequestContext.getResponse();
    if (responseVo.isOk()) {
      byte[] bodyBytes = responseVo.getBodyBytes();
      Files.write(Paths.get(filename), bodyBytes);
      
      String suffix = FilenameUtils.getSuffix(filename);
      // 设置响应内容类型，此处使用 Markdown 格式
      String contentType = ContentTypeUtils.getContentType(suffix);
      log.info("filename:{},{}", filename, contentType);
      
      
      // 设置 Content-Type 响应头，确保浏览器以正确格式解析文件内容
      response.setContentType(contentType);
      // 设置 Content-Disposition 响应头，告知浏览器将内容作为附件下载，并指定默认文件名
      response.setAttachmentFilename(filename);
      
      response.setFileBody(new File(filename));
    }
    return response;
  }

}
