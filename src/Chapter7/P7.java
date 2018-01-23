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
public class P7 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] mainArray;
        double avg;
        
        System.out.println("Enter Array Size:");
        mainArray = new int[in.nextInt()];
        
        fillArray(mainArray);
        avg = average(mainArray);
        System.out.println("The average is "+ avg);
        
        printArray(mainArray);
        
    }
    
    static void fillArray(int[] a){
    
            Scanner in = new Scanner(System.in);
            for(int x = 0; x < a.length; x++){
            System.out.println("Enter a Number:");
            a[x] = in.nextInt();
            }
    }
    
    static double average(int[] a){
        double sum = 0;
        for(int x = 0; x < a.length; x++){
            sum += a[x];
        }
        return sum/a.length;
    }
    
    static void printArray(int[] a){
        for(int x = 0; x < a.length; x++){
            System.out.print(" " + a[x]);
        }
        System.out.println();
    }
}
