package com.mypro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//导入mapper(映射)
@MapperScan("com.mypro.mapper")
public class WebMain {

    public static void main(String[] args) {
        SpringApplication.run(WebMain.class);
    }
}
