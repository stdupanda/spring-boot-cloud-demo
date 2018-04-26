package cn.xz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
@EnableDiscoveryClient
public class Application {

    public static void main(String[] args) {
        // 使用 http://localhost:8087/zipkin 访问 zipkin 管理台
        SpringApplication.run(Application.class, args);
    }
}
