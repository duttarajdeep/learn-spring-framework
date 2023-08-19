package com.springpractice.learnspringframework.examples.businesscalculation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalculationAppLauncher {

    public static void main(String[] args) {

        var applicationContext = new AnnotationConfigApplicationContext(BusinessCalculationAppLauncher.class);

        int max = applicationContext.getBean(BusinessCalculationService.class).findMax();

        System.out.println(max);

    }

}
