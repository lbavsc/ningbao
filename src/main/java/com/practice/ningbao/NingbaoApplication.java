package com.practice.ningbao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class NingbaoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(NingbaoApplication.class, args);
    }

    /**
     * 为了打包springboot项目
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }

}
