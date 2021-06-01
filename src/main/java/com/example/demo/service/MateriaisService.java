package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Service;

@Service("materiaisService")
@PropertySource("classpath:materiais.properties")
public class MateriaisService {
    @Value("${gMateriais/teste}")
    private String gMateriais;

    @Bean
    public String[] getMateriais() throws Exception {
        return this.gMateriais.split(",");
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}