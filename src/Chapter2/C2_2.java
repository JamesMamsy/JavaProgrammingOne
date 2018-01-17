
package Chapter2;

import java.util.Scanner;

/**
 * Determines area and perimeter of a sphere with console-inputed radius and
 * length
 *
 * @author James Miller
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float radius = input.nextFloat();
        System.out.print("Enter Length: ");
        float length = input.nextFloat();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("Area: " + area + "\n" + "Volume: " + volume);

    }

}
