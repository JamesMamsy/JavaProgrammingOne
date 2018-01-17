
package Chapter4;

import java.util.Scanner;

/**
 * Compares rates of two builders and their rates based off user values
 *
 * @author James Miller
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String name1;
        int hours1;
        double price1;

        String name2;
        int hours2;
        double price2;

        double total1;
        double total2;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the name of the first bidder: ");
        name1 = in.nextLine();
        System.out.print("How long will " + name1 + " have to work: ");
        hours1 = in.nextInt();
        System.out.print("How much is the hourly rate for " + name1 + ": ");
        price1 = in.nextDouble();

        System.out.print("What is the name of the second builder: ");
        name2 = in.next();
        System.out.print("How long will " + name2 + " have to work: ");
        hours2 = in.nextInt();
        System.out.print("How much is the hourly rate for " + name2 + ": ");
        price2 = in.nextDouble();

        total1 = price1 * hours1;
        total2 = price2 * hours2;

        if (total1 < total2) {
            System.out.printf(name1 + " has the better bid, $%4.2f ", total1);
        }
        if (total2 < total1) {
            System.out.printf(name2 + " has the best bid, $%4.2f ", total2);
        }
        if (total1 == total2) {
            if (hours1 < hours2) {
                System.out.printf(name1 + " has the better bid, $%4.2f", total1);
            } else if (hours1 > hours2) {
                System.out.printf(name2 + " has the best bid, $%4.2f", total2);
            } else if (hours1 == hours2) {
                System.out.printf("Both bids are identical! \nCost: $%4.2f \nPer Hour: %4.2f \n", total1, price1);
            }
        }

    }
}
