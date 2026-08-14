public class Main {
    public static void main(String[] args) {

        displayHighScorePosition("CJ",calculateHighScorePosition(1500));
        displayHighScorePosition("Minami",calculateHighScorePosition(900));
        displayHighScorePosition("Ed",calculateHighScorePosition(400));
        displayHighScorePosition("Magina",calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position: " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000) {
            return 1;
        }else if(playerScore >= 100){
            return 2;
        }else if(playerScore >= 100){
            return 3;
        }
        else{
            return 4;
        }

    }

}