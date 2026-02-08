FROM litongjava/jdk:21_0_6-stable-slim

# 设置工作目录
WORKDIR /app

# 复制 jar 文件到容器中
COPY target/open-chat-server-1.0.jar /app/

# 运行 jar 文件
CMD ["java", "-jar", "open-chat-server-1.0.jar", "--app.env=prod"]