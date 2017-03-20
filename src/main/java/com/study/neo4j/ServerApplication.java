package com.study.neo4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.io.IOException;

@SpringBootApplication
public class ServerApplication extends SpringBootServletInitializer implements CommandLineRunner {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServerApplication.class);
    }


    public static void main(String[] args) throws IOException {
        SpringApplication.run(ServerApplication.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {

        System.out.println("初始化。。。。。。。。。。。。");
    }
}