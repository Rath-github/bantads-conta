package com.ufpr.conta.account.amqp;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmqpConfig {

    @Bean
    public Queue accountQueue() {
        return new Queue("accountQueue", false);
    }
}