package com.springpractice.learnspringframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class SimpleSpringContextAppLauncher {
    public static void main(String[] args) {

        try (var applicationContext = new AnnotationConfigApplicationContext(SimpleSpringContextAppLauncher.class)) {
            Arrays.stream((applicationContext.getBeanDefinitionNames()))
                    .forEach(System.out::println);
        }
    }

}
