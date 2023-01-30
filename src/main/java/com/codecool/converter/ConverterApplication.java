package com.codecool.converter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class ConverterApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml") {
                };
        PizzaMaker pizzaMaker = (PizzaMaker) context.getBean("pizzaMaker");
        pizzaMaker.makePizza();
    }

}
