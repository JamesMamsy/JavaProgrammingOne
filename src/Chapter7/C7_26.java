package Chapter7;

import java.util.Scanner;

/**
 * Compares to lists and determines if they are identical
 *
 * @author James Miller
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[in.nextInt()];
        for (int x = 0; x < list1.length; x++) {
            list1[x] = in.nextInt();
        }

        System.out.print("Enter list2: ");
        int[] list2 = new int[in.nextInt()];
        for (int x = 0; x < list2.length; x++) {
            list2[x] = in.nextInt();
        }

        if (equals(list1, list2)) {
            System.out.print("Two lists are stricly identical.");
        } else {
            System.out.print("Two lists are not stricly identical.");
        }

    }

    /**
     * Determines if two arrays are equal
     *
     * @param list1 decsription?
     * @param list2 decsription?
     * @return True if two arrays are identical, false if not
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int x = 0; x < list1.length; x++) {
            if (list1[x] != list2[x]) {
                return false;
            }
        }
        return true;

    }

}
