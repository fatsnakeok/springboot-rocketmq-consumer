package com.fatsnake.rocketmq.consumer.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2020-02-20 19:52
 * Copyright (c) 2020, zaodao All Rights Reserved.
 */
@Component
@RocketMQMessageListener(topic = "springbbot-rocketmq", consumerGroup = "${rocketmq.consumer.group}")
public class Consumer implements RocketMQListener<String> {


    @Override
    public void onMessage(String s) {
        System.out.println("接收到消息：" + s);
    }
}
