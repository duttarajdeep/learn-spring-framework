package com.springpractice.learnspringframework;

import game.Game;
import game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("game")
public class GamingAppLauncher {
    public static void main(String[] args) {

        try (var applicationContext = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) {
            applicationContext.getBean(Game.class).up();
            applicationContext.getBean(GameRunner.class).run();
        }
    }

}
