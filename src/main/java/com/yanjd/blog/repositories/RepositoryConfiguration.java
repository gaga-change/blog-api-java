package com.yanjd.blog.repositories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {
    @Bean
    PostEventHandler postEventHandler() {
        return new PostEventHandler();
    }
}
