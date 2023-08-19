package com.springpractice.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com/springpractice/learnspringframework/game")
public class GamingAppLauncher {
    public static void main(String[] args) {

        try (var applicationContext = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) {
            applicationContext.getBean(Game.class).up();
            applicationContext.getBean(GameRunner.class).run();
        }
    }

}
