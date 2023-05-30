package com.example.springsecuritytestproject.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource dataSource(){
        return DataSourceBuilder.create().url("jdbc:postgresql://localhost:5432/security_test")
                .username("cuba")
                .password("cuba")
                .build();
    }
}
