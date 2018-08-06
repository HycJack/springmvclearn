package com.hycjack.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018\7\15 0015.
 */
@Component
public class KafkaConsumer {
    /**
     * 监听test主题,有消息就读取
     * @param message
//     */
    @KafkaListener(topics = {"test"})
    public void consumer(String message){
        int count =0;
        System.out.println(("test topic message : {}"+message));
    }
}
