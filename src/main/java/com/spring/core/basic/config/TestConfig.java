package com.spring.core.basic.config;

import com.spring.core.basic.singleton.StatefulService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public StatefulService statefulService() {
        return new StatefulService();
    }
}