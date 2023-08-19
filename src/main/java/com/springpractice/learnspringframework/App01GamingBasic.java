package com.springpractice.learnspringframework;

import com.springpractice.learnspringframework.game.GameRunner;
import com.springpractice.learnspringframework.game.MarioGame;
import com.springpractice.learnspringframework.game.SuperContra;

public class App01GamingBasic {

    public static void main(String[] args) {
        var mario = new MarioGame();
        var gameRunner = new GameRunner(mario);
        gameRunner.run();

        var contra = new SuperContra();
        var gameRunner2 = new GameRunner(contra);
        gameRunner2.run();
    }

}
