
package Chapter1;

/**
 * Determines Perimeter and Area and a Circle with a set radius of 5.5
 *
 * @author James Miller
 */
public class C1_8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double radius = 5.5;
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

}
