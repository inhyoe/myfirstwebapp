package com.in28minutes.learnspringframework.game;

public class MarioGame implements GamingConsoleInterface{
    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Go into a hole");
    }

    public void left(){
        System.out.println("go back");
    }

    public void right(){
        System.out.println("Accelerate");
    }

}