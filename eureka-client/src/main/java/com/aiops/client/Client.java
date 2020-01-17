package com.aiops.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Client {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Client.class)
                .web(true).run(args);
    }
}
