package com.beyondli.rest;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by beyondLi
 * Date 2017/12/21
 * Desc 生产者rest .
 */
@Service
public class CustomerRest {

    /**
     * 监听方
     */
    //监听注解
    @JmsListener(destination = "beyondLiQueueTest")
    public void getQueue(String info) {
        System.out.println("成功监听beyondLiQueue消息队列，传来的值为:" + info);
    }

    //
    @JmsListener(destination = "beyondLiDelayQueueTest")
    public void getDelayQueue(String info) {
        System.out.println("成功监听beyondLiQueueTest消息队列，传来的值为:" + info + "当前时间为" + LocalDateTime.now());
    }
}
