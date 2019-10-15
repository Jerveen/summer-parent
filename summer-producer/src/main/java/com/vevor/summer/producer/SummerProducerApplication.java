package com.vevor.summer.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xyw
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SummerProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SummerProducerApplication.class, args);
    }

}
