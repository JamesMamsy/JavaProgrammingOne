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
public class C7_9 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[10];
        System.out.println("Please enter 10 numbers: ");
        for(int x = 0; x < 10; x++){
            a[x] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(a));
        
                
    }
    public static double min(double[] array){
        double min = array[0];
        for(double x: array){
            if(x < min)
                min = x;
        }
        return min;
    }

}
