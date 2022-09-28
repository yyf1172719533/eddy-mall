package com.timain.eddy.mall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yyf
 * @version 1.0
 * @date 2022/9/28 17:11
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EddyMallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EddyMallGatewayApplication.class, args);
    }
}
