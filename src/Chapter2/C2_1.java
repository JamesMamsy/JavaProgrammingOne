package Chapter2;

import java.util.Scanner;

/**
 * Converts an console-inputed Farenheit value into Celsius
 *
 * @author James Miller
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature In Celsius: ");
        double cel = input.nextDouble();
        double result = (9 / 5) * cel + 32;
        System.out.println("The temperature in Fahrenheit is: " + result);
    }

}
