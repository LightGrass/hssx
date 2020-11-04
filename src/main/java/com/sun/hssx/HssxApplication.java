package com.sun.hssx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.sun.hssx.mapper"})
@SpringBootApplication
public class HssxApplication {

    public static void main(String[] args) {
        SpringApplication.run(HssxApplication.class, args);
    }

}
