package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{
    public void up(){
        System.out.println("chomp up");
    }

    public void down(){
        System.out.println("chomp down");
    }

    public void left(){
        System.out.println("chomp left");
    }

    public void right(){
        System.out.println("chomp right");
    }
}
