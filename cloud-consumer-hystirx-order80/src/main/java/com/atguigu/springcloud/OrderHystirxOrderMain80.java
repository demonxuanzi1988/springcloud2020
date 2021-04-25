package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: lx
 * @Date: 2021/4/23 17:06
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystirxOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystirxOrderMain80.class,args);
    }
}
