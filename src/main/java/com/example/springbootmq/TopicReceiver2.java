package com.example.springbootmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "log.all")
public class TopicReceiver2 {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("log.* 消费消息：" + msg);
    }
}
