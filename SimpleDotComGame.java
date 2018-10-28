package SimpleDotCom;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args){

        SimpleDotCom theDotCom = new SimpleDotCom();
        GameHelper helper = new GameHelper();

        int guesses = 0;

        int randomNum = (int) (Math.random()*5);

        ArrayList<String> locations = {randomNum, randomNum + 1, randomNum + 2};

        theDotCom.setLocationCells(locationCells);

        boolean isAlive = true;

        while(isAlive = true){

            String guess;

            guess = helper.getUserInput("enter a number");

            String result = theDotCom.checkYourself(guess);

            guesses++;

            if(result.equals("kill")){
                isAlive = false;

                System.out.println("you took "+guesses+" guesses to take down the dotcom");

            }
        }





    }
}
