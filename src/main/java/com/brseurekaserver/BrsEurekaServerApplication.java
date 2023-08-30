package com.brseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class BrsEurekaServerApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BrsEurekaServerApplication.class, args);

        new SpringApplicationBuilder()
                .profiles("dev")
                .sources(BrsEurekaServerApplication.class)
                .run(args);
    }

}
