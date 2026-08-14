// This program calculates and displays a player's final score when the game
// is over. The final score is the base score plus a bonus for each level
// completed. It demonstrates this twice with two different sets of values,
// reusing the same finalScore variable.
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

            score = 10_000;
            levelCompleted = 8;
            bonus = 200;
            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}