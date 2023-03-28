package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingBasicJava {
    public static void main(String[] args) {



        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame(); //step 1 object creation

        var gameRunner = new GameRunner(game); //step 2 objection creation + wiring dependencies i.e. game is a dependency of gameRunner class
        gameRunner.run();

    }
}
