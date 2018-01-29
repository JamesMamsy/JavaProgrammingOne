package Chapter3;

import java.util.Random;
import java.util.Scanner;

/**
 * Determines if a input is divisible by 5 or 6
 *
 * @author James Miller
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bySix = false;
        boolean byFive = false;
        boolean both = false;
        int number; //initialize variables

        System.out.print("Enter an intger: ");
        number = input.nextInt(); //accept userinput
        if (number % 5 == 0 && number % 6 == 0) {
            both = true;

        }
        if (number % 5 == 0 || number % 6 == 0) //see if the input is perfectly divisible by 5 or 6
        {
            byFive = true;
        }
        if (number % 6 == 0 ^ number % 5 == 0) {
            bySix = true;
        }
        System.out.println("Is " + number + " divisible by 5 and 6? " + both); //return output to user
        System.out.println("Is " + number + " divisible by 5 or 6? " + byFive);
        System.out.println("Is " + number + " divisible by 5 & 6, but not both? " + bySix);
    }

}
