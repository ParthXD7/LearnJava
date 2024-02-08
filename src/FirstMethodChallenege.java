public class FirstMethodChallenege {
    public static void main(String[] args) {
        System.out.println(calculateHighScorePosition(5));
    }
    public static int calculateHighScorePosition(int playerScore){
        int playerposition = 4;
    if (playerScore >= 1000){
        playerposition = 1;
    }else if (playerScore >= 500){
        playerposition = 2;
    }else if (playerScore >= 100){
        playerposition = 3;
    }
    return playerposition;
    }
}
