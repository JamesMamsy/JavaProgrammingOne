package Chapter2;

import java.util.Scanner;

/**
 * Adds a tip of an a user inputed percent to the total purchase and displays
 * the total
 *
 * @author James Miller
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        float subTotal;
        float tipRate;
        float total;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Subtotal: ");
        subTotal = input.nextFloat();

        System.out.print("Enter The gratuity rate (as whole number): ");
        tipRate = input.nextFloat();

        tipRate = tipRate / 100;
        total = subTotal + (subTotal * tipRate);
        System.out.println("Your total plus tip is $" + total);

    }

}
