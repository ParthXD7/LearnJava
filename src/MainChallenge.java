public class MainChallenge {
    public static void main(String[] args) {
        System.out.println("High Score is :- "+CalcScore(true,800,5,100));

    }

    public static int CalcScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score Was " + finalScore);
        }
        return finalScore;
    }


}
