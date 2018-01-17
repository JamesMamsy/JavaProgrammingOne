package Chapter5;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Lets user enter a string and outputs the reverse of the string to the console
 *
 * @author James Miller
 */


public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = in.next();
        char[] c1 = s1.toCharArray();
        char[] c2 = new char[s1.length()];
        int stringSpot = s1.length();

        for (char c : c1) {
            c2[stringSpot - 1] = c;
            stringSpot = stringSpot - 1;
        }

        System.out.print("That string in reverse is: " + Arrays.toString(c2));
    }

}
