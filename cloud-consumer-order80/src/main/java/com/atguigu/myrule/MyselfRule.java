package com.atguigu.myrule;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: lx
 * @Date: 2021/4/23 10:56
 * @Description: 负载均衡策略配置
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule(); //定义为随机
    }
//    @Bean
//    public IRule myRule1(){
//        return new RoundRobinRule(); //定义为轮询
//    }
//    @Bean
//    public IRule myRule2(){
//        return new RetryRule(); //定义为轮询 失败后在指定时间内进行重试
//    }
//    @Bean
//    public IRule myRule3(){
//        return new WeightedResponseTimeRule(); //对轮询的扩展，响应越快，权重越大
//    }
//    @Bean
//    public IRule myRule4(){
//        return new BestAvailableRule(); //过滤掉多次访问处于跳闸状态的服务，然后选择一个并发量最小的服务
//    }
//    @Bean
//    public IRule myRule5(){
//        return new AvailabilityFilteringRule(); //先过滤掉故障实例，再选择并发较小的实例
//    }
//    @Bean
//    public IRule myRule6(){
//        return new ZoneAvoidanceRule(); //默认规则，复合判断server所在区域的性能和server的可用性选择服务器
//    }
}
