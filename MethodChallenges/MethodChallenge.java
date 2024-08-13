package MethodChallenges;

public class MethodChallenge {

    public static void main(String[] args) {

        int score = calculateHIghScorePosition(1500);
        displayHighScorePosition("John", score);

        score = calculateHIghScorePosition(676);
        displayHighScorePosition("Jack", score);

        score = calculateHIghScorePosition(100);
        displayHighScorePosition("Jill", score);

        score = calculateHIghScorePosition(20);
        displayHighScorePosition("Bob", score);


    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");

    }

    public static int calculateHIghScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;

        } else if (playerScore >= 500) {
            position = 2;

        } else if (playerScore >= 100) {
            position = 3;

        }
        return position;
    }

}
