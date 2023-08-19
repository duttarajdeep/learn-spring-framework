package com.springpractice.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private Game game;

    public GameRunner(@Qualifier("SuperContra") Game game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running Game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
