/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

import java.util.Scanner;

/**
 *
 * @author James Miller
 */
public class C7_1 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int gradeNum;

        System.out.println("Enter the number of grades: ");
        gradeNum = input.nextInt();
        int[] grades = new int[gradeNum];
        char[] gradeLabel = new char[gradeNum];
        System.out.println("Please enter the " + gradeNum + " grades: ");

        int max = 0;
        for (int x = 0; x < gradeNum; x++) {
            grades[x] = input.nextInt();
            if (max < grades[x]) {
                max = grades[x];
            }

        }
        
        for (int x = 0; x < gradeNum; x++) {
            if (grades[x] >= max - 10) {
                gradeLabel[x] = 'A';
            } else if (grades[x] >= max - 20) {
                gradeLabel[x] = 'B';
            } else if (grades[x] >= max - 30) {
                gradeLabel[x] = 'C';
            } else if (grades[x] >= max - 40) {
                gradeLabel[x] = 'D';
            } else {
                gradeLabel[x] = 'F';
            }
            System.out.println("Student " + x + " score is " + grades[x] + " and grade is " + gradeLabel[x]);
        }

    }
}
