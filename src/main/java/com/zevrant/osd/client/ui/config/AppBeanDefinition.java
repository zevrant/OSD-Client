package com.zevrant.osd.client.ui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppBeanDefinition {

    @Bean
    public ProcessBuilder processBuilder() {
        return new ProcessBuilder();
    }
}
