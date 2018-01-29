package Chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Allows user to guess side of a coin toss and tells them if they will succeed
 * in life or not
 *
 * @author James Miller
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random coin = new Random();	//initialize Scanner and Random Number Generator
        boolean coinSide = coin.nextBoolean();  //Randomly select coin side
        System.out.print("Please guess either heads or tails (h or t): "); //Prompt user and accept their input 
        String guessString = input.next();
        boolean guess;
        if (guessString == "h") //Convert coin side to a Boolean value with an if statement
        {
            guess = true;
        } else {
            guess = false;
        }
        if (guess == coinSide) //Compare  coin tosses.
        {
            System.out.print("You Win!");
        } else {
            System.out.print("You Lose.");
        }
    }

}
