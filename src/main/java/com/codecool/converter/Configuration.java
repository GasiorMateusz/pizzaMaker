package com.codecool.converter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Value("${isWooden:false}")
    private boolean isWooden;

    @Bean
    public Stove Stove() {
        if(isWooden){
            return new WoodenStove();
        }
        return new NormalStove();
    }
}
