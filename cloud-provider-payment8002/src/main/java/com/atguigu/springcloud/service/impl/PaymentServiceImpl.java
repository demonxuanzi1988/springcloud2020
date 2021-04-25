package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: lx
 * @Date: 2021/4/21 13:05
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    /**
     *
     * @param payment
     * @return
     */
    public int create(Payment payment)
    {
     return paymentDao.create(payment);
    }

    /**
     *
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id)
    {
        return paymentDao.getPaymentById(id);
    }

}
