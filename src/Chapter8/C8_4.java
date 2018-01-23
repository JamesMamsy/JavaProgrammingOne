/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;
import java.util.Arrays;

/**
 * Uses Hours class to calculate total hours worked.
 * @author jm0982431
 */
public class C8_4 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Hours[] employeeHours = new Hours[8];

        int[][] hoursWorked = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        for (int x = 0; x < hoursWorked.length; x++) {
            employeeHours[x] = new Hours(x, hoursWorked[x]);
        }

        Arrays.sort(employeeHours);

        System.out.println("ID | M | T | W | Th| Fr| Sa| Su | Total | ");

        for (Hours cur : employeeHours) {
            System.out.print(cur.getId() + "    ");
            int[] h = cur.getHours();
            for (int x : h) {
                System.out.print(x + "   ");
            }
            System.out.print("  " + cur.getTotalHours() + "\n");
        }

    }

}


