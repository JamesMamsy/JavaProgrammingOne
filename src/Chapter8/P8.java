package Chapter8;

import java.util.Scanner;

/**
 * Allows input of data into multi-dimentional array
 *
 * @author James Miller
 */
public class P8 {

    /**
     * main method
     *
     * @param args arguments from console
     */
    public static void main(String[] args) {
        //initialize dataset and variables
        double[][] salesData = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},};
        Scanner in = new Scanner(System.in);
        String id;
        String day;
        int isValidDay;
        double ammount;
        int idIndex;
        String reply = "Y";
        String[] iDs = {"A", "B", "C", "D"};
        String[] days = {"M", "T", "W", "H", "F"};

        //While user is not saying no
        while (!reply.equals("N")) {

            //Prompt id and verify its valid
            idIndex = -1;

            while (idIndex == -1) {
                System.out.println("Enter the salesman ID as A, B, C, or D. ");
                id = in.next().toUpperCase();
                idIndex = binSearch(id, iDs);

                if (idIndex == -1) {
                    System.out.println("Invalid Code Enter Again:");
                }
            }

            //Prompt for day and verify
            isValidDay = -1;

            while (isValidDay == -1) {
                System.out.println("Enter the day as M, T, W, H, or F. ");
                day = in.next().toUpperCase();
                isValidDay = binSearch(day, days);

                if (isValidDay == -1) {
                    System.out.println("Invalid Day");
                }
            }

            //Prompt for sale value
            System.out.println("Enter the amount of the sale ");
            ammount = in.nextDouble();

            //Add sale to data table at location specfied
            salesData[idIndex][isValidDay] += ammount;

            //Go again?
            do {
                System.out.println("More data? Enter Y for more or N to stop.");
                reply = in.next().toUpperCase();
            } while (!reply.equals("Y") && !reply.equals("N"));

        }

        //Display output, Crudely print legend out first :/
        System.out.println("ID |  M  |  T  |  W  |  H  |  F  |");

        for (int x = 0; x < salesData.length; x++) {
            System.out.print(iDs[x] + "  ");

            for (double y : salesData[x]) {
                System.out.print(" " + y + "  ");
            }
            System.out.println();
        }
    }

    /**
     * binSearch Attempts to find String d in array C
     *
     * @param d Value to be searched for, String
     * @param c Array where value will be looked for
     * @return Index of Value found or -1 if not found
     */
    public static int binSearch(String d, String[] c) {
        for (int x = 0; x < c.length; x++) {
            if (d.equals(c[x])) {
                return x;
            }
        }
        return -1;
    }
}
