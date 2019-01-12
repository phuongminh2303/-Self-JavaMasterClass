package com.phuongminh;

public class Main {

    public static void main(String[] args) {
	    int Score = 10000;
	    int level = 8;
	    int bonus = 200;
	    boolean gameOver = true;

	    if (gameOver){
	       int TotalScore = Score + level * bonus;
            System.out.println("Your score = " + TotalScore);
        }
    }
}
