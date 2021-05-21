package ChapterSeven;

import java.security.SecureRandom;

public class GameOfCraps {
    SecureRandom randomGenerator=new SecureRandom();
    public int rollDice(){
        int die1=1+randomGenerator.nextInt(6);
        int die2=1+randomGenerator.nextInt(6);
        return die1+die2;
    }

    public void playCrapGame(){
        rollDice();
        System.out.println(rollDice());
        if (rollDice() == 7 || rollDice() == 11) {

            System.out.println("you've won");
        }
        else System.out.println("olodo");
    }

    public static void main(String[] args) {
        GameOfCraps gameOfCraps=new GameOfCraps();
        //System.out.println(gameOfCraps.playCrapGame());
    }


}
