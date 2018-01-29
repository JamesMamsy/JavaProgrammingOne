package Chapter7;

import java.util.Scanner;

/**
 * Takes an array size and contents from user, then displays the average numbers
 *
 * @author James Miller
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mainArray;
        double avg;

        System.out.println("Enter Array Size:");
        mainArray = new int[in.nextInt()];

        fillArray(mainArray);
        avg = average(mainArray);
        System.out.println("The average is " + avg);

        printArray(mainArray);

    }

    /**
     * Takes inputs from user to fill index in an array
     *
     * @param a Array to be filled
     */
    static void fillArray(int[] a) {

        Scanner in = new Scanner(System.in);
        for (int x = 0; x < a.length; x++) {
            System.out.println("Enter a Number:");
            a[x] = in.nextInt();
        }
    }

    /**
     * Calculated average of an array of number
     *
     * @param a Numbers for average to be found
     * @return Average of values
     */
    static double average(int[] a) {
        double sum = 0;
        for (int x = 0; x < a.length; x++) {
            sum += a[x];
        }
        return sum / a.length;
    }

    /**
     * Prints out an entire array to the console
     *
     * @param a Array to be displayed
     */
    static void printArray(int[] a) {
        for (int x = 0; x < a.length; x++) {
            System.out.print(" " + a[x]);
        }
        System.out.println();
    }
}
