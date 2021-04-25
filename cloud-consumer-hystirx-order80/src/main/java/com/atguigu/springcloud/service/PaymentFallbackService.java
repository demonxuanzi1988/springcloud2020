package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Auther: lx
 * @Date: 2021/4/24 15:55
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall paymentInfo_OK，o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fall paymentInfo_TimeOut，o(╥﹏╥)o";
    }
}
