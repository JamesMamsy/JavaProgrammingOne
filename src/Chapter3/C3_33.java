package Chapter3;

import java.util.Scanner;

/**
 * Compares prices of two package delivery rates and determines better deal
 *
 * @author James Miller
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float price1;
        float price2;
        int weight1;
        int weight2;
        float total1;
        float total2;

        //Get user input from both packages
        System.out.print("Enter the price and weight of the first package respectively: ");
        price1 = input.nextFloat();
        weight1 = input.nextInt();
        total1 = price1 * weight1;

        System.out.print("Enter the price and weight of the second package respectively: ");
        price2 = input.nextFloat();
        weight2 = input.nextInt();
        total2 = price2 * weight2;
        //Compare packages and return output to user
        if (total1 < total2) {
            System.out.println("Package 1 has the best price.");
        } else if (total1 == total2) {
            System.out.println("Both packages are equal in price.");
        } else {
            System.out.println("Package 2 has the best price.");
        }
    }

}
