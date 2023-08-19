package com.springpractice.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Component
class Dependency3 {

}

@Component
class Dependency4 {

}

@Component
class Dependency5 {

}

@Component
class YourBusinessClass {

    // Field injection
    @Autowired
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;

    Dependency3 dependency3;

    Dependency4 dependency4;

    Dependency5 dependency5;

    // Constructor injection - Spring recommends this because all the initialization happens in one method
    @Autowired // this is optional Constructor injection
    public YourBusinessClass(Dependency5 dependency5) {
        System.out.println("Using Constructor injection -> dependency5");
        this.dependency5 = dependency5;
    }

    // Setter injection
    @Autowired
    public void setDependency3(Dependency3 dependency3) {
        System.out.println("Using Setter injection -> dependency3");
        this.dependency3 = dependency3;
    }

    @Autowired
    public void setDependency4(Dependency4 dependency4) {
        System.out.println("Using Setter injection -> dependency4");
        this.dependency4 = dependency4;
    }

    public String toString() {
        return "Using: " + dependency1 + " and " + dependency2;
    }
}

@Configuration
@ComponentScan
public class DependencyInjectionAppLauncher {
    public static void main(String[] args) {

        try (var applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionAppLauncher.class)) {
            Arrays.stream((applicationContext.getBeanDefinitionNames()))
                    .forEach(System.out::println);
            System.out.println(applicationContext.getBean(YourBusinessClass.class));
        }
    }

}
