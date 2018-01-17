
package Chapter4;
import java.util.Scanner;
/**
 * Determines if a inputed string is a substring of another inputed string 
 * @author James Miller
 */
public class C4_22 {
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String s1: ");
        s1 = in.nextLine();
        System.out.print("Enter String s2: ");
        s2 = in.nextLine();
        if(s1.contains(s2))
            System.out.println(s2 + " is a substring of " + s1);
        else 
            System.out.println(s2 + " is not a substring of " + s1);
        
        
    }   

}
