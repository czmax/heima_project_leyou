package com.leyou.service.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Chen
 * @created 2018-12-07-21:15.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LeyouItemService {
    public static void main(String[] args) {
        SpringApplication.run(LeyouItemService.class);
    }
}
