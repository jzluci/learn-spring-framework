package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {

    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
    /*@Bean
    public SuperContraGame superContraGame(){
        return new SuperContraGame();
    }
    @Bean
    public MarioGame marioGame(){
        return new MarioGame();
    }*/




}
