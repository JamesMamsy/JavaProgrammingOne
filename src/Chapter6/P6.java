package Chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Converts US currency to Euros, Yen, or Pounds based on user inputed
 * conversion rates
 *
 * @author James Miller
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        float eurosInDollar;
        float poundsInDollar;
        float yenInDollar;
        String usrCur;
        float usrAmmt;
        float converted = 0;
        boolean running = true;
        DecimalFormat cash = new DecimalFormat("$###,###,###.##");

        //Prompt for conversion rates
        System.out.print("How many Euros are in a US Dollar: ");
        eurosInDollar = in.nextFloat();
        System.out.print("How many Pounds Sterling are in a US Dollar: ");
        poundsInDollar = in.nextFloat();
        System.out.print("How many Yen are in a US Dollar: ");
        yenInDollar = in.nextFloat();

        //Prompt for currency 
        while (running) {
            System.out.print("Ammount of USD: ");
            usrAmmt = in.nextFloat();

            //Take Deduction based on initial value
            if (usrAmmt > 100) {
                usrAmmt *= .95;
            } else {
                usrAmmt *= .9;
            }

            //Prompt for desired currency 
            System.out.print("Enter “E” to buy Euros, “P” to buy Pounds, or “Y” to buy Yen: ");
            usrCur = in.next();

            //Determine and apply exchange rate
            if ("E".equalsIgnoreCase(usrCur)) {
                converted = currencyConvert(eurosInDollar, usrAmmt);
            } else if ("P".equalsIgnoreCase(usrCur)) {
                converted = currencyConvert(poundsInDollar, usrAmmt);
            } else if (usrCur.equalsIgnoreCase("Y")) {
                converted = currencyConvert(yenInDollar, usrAmmt);
            }
            //Return Output to User
            System.out.println("You will recieve " + cash.format(converted) + " of the desired currency.");

            //Loop Again
            String usrCont = "";
            do {
                System.out.println("Would you like to make another conversion? ");
                usrCont = in.next();
                //Ensure that the answer is either yes or no
                if (!("yes".equals(usrCont.toLowerCase()) || "no".equals(usrCont.toLowerCase()))) {
                    System.out.println("Please enter valid answer");
                } //if no then dont execute the loop again
                else if ("no".equals(usrCont.toLowerCase())) {
                    running = false;
                }

            } while (!("yes".equals(usrCont.toLowerCase()) || "no".equals(usrCont.toLowerCase())));

        }

    }

    /**
     * Takes a given currency rate and amount and returns converted amount in a
     * new currency
     *
     * @param rate the conversion rate
     * @param ammt the amount of currency to convert
     * @return the converted currency amount
     */
    static float currencyConvert(float rate, float ammt) {
        return rate * ammt;
    }
}
