package com.leyou.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Chen
 * @created 2018-12-07-20:18.
 */
@SpringBootApplication
@EnableEurekaServer
public class LeyouRegistry {
    public static void main(String[] args) {
        SpringApplication.run(LeyouRegistry.class);
    }
}
