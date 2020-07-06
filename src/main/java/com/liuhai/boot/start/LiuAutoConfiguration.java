package com.liuhai.boot.start;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("classpath:/liu.properties")
@EnableConfigurationProperties(LiuProperties.class)
public class LiuAutoConfiguration {

    private LiuProperties properties;

    public LiuAutoConfiguration(LiuProperties properties) {
        this.properties = properties;
    }

    @Bean
    public LiuHelloService helloService(){
        return new LiuHelloService(properties);
    }
}
