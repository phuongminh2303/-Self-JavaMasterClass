package com.phuongminh;

public class Main {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);

        calculateScore(true, 123, 10, 1234);

        int score = returnScore(true, 200, 6, 10);
        System.out.println("your score = " + score);

        /* - Create a method called displayHighScorePosition
         it should players name as a parameter, and a second parameter as a
         position in the high score table
         - You should display the players name along with a message like
         " managed to get into position" and the position they got along with
         further message "on the high score table".

         - Create a 2nd method called calculatedHighScorePosition. It should be
         sent one argument only, the player score. It should return int. The
         return data should be:
            + 1 if the score is  > 1000
            + 2 if the score is > 500 and < 1000
            + 3 if the score is > 100 and < 500
            + 4 in all other cases

         - Call both methods and display the result of the following a score of
         1500, 900, 400, 50.
        */
        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Dinh ", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Nhu ", highScorePosition);

        highScorePosition = calculateHighScorePosition(200);
        displayHighScorePosition("Minh ", highScorePosition);

        highScorePosition = calculateHighScorePosition(30);
        displayHighScorePosition("Phuong ", highScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get in to position " +
        position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if (playerScore >= 1000)
            position = 1;
        else if (playerScore >= 500)
            position = 2;
        else if (playerScore >= 100);
            position = 3;

        return position;
    }


    public static void calculateScore(boolean gameOver, int score,
                                      int levelComplete, int bonus) {
        if (gameOver) {
            System.out.println("your score = " + (score + levelComplete * bonus));
        }
    }

    public static int returnScore(boolean gameOver, int score,
                                  int levelComplete, int bonus) {
        if (gameOver) {
            score += levelComplete * bonus;
            return score;
        }
        return -1;
    }
}
