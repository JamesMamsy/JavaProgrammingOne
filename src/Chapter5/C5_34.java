package Chapter5;

import java.util.Random;
import java.util.Scanner;

/**
 * Simple Rock,Paper, Scissors Game where the user inputes r,p, or s and the
 * computer chooses a random int representing one of the 3
 *
 * @author James Miller
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int compWins = 0;
        int usrWins = 0;
        String choice;
        String compChoice;
        String[] options = {"r", "p", "s"};
        Scanner in = new Scanner(System.in);
        Random ran = new Random();

        do {
            System.out.println("Please choose rock (r), paper(p), or scissors(s).");
            choice = in.nextLine().toLowerCase();
            compChoice = options[ran.nextInt(2)];

            if (choice.equals(compChoice)) {
                System.out.println("It is a tie!");
            } else if (("r".equals(choice) && "s".equals(compChoice))
                    || ("s".equals(choice) && "p".equals(compChoice))
                    || ("p".equals(choice) && "r".equals(compChoice))) {
                System.out.println("You Win!. Total Wins: " + ++usrWins);
            } else {
                System.out.println("You lose. Total Losses: " + ++compWins);
            }

        } while (usrWins != compWins * 2 || compWins != usrWins * 2);

    }
}
