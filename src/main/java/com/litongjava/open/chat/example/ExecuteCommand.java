package com.litongjava.open.chat.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExecuteCommand {
  public static void main(String[] args) {
    try {
      // 执行命令
      String command = "dir";
      Process process = Runtime.getRuntime().exec(command);

      // 读取命令输出
      BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }

      // 等待命令执行完成
      int exitCode = process.waitFor();
      System.out.println("Exit code: " + exitCode);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
