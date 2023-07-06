package com.cn.czz.cameraphone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.cn.czz.cameraphone.mapper")
public class CameraPhoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(CameraPhoneApplication.class, args);
    }

}
