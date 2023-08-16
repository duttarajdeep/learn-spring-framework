package com.springpractice.learnspringframework;

import game.GameRunner;
import game.MarioGame;
import game.SuperContra;

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
