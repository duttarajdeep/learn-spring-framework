package game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private Game game;
    public GameRunner(Game game){
        this.game = game;
    }

    public void run(){
        System.out.println("Running Game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
