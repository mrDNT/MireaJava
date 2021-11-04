package com.company;

public class Main {
    public static void main(String[] args) {
	Ball first_ball = new Ball(1,"red");
	Ball second_ball = new Ball();
	System.out.println(first_ball.BallInfo());
	System.out.println(second_ball.BallInfo());
    }
}
