package com.leyou.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author Chen
 * @created 2018-12-07-20:49.
 */
@SpringBootApplication
@SpringCloudApplication
public class LeyouGateway {
    public static void main(String[] args) {
        SpringApplication.run(LeyouGateway.class);
    }
}
