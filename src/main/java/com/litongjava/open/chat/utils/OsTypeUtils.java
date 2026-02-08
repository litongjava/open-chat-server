package com.litongjava.open.chat.utils;

/**
 * @author litongjava <litongjava@qq.com>
 *
 */
public class OsTypeUtils {
  private static String osType;

  /**
   * 判断操作系统的类型,确定使用命令前缀 windows ==> cmd /c linux ==> sh -c
   */
  static {
    osType = System.getProperty("os.name");
  }

  public static String getOsType() {
    return osType;
  }
}
