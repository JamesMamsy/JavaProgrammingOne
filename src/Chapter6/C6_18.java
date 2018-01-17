package Chapter6;

import java.util.Scanner;

/**
 * Takes possible password from user and checks to see if is secure enough
 *
 * @author James Miller
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String password;
        int numInt;
        boolean noValidPass = true;
        Scanner in = new Scanner(System.in);
        //Prompt user for password

        while (noValidPass) {
            System.out.println("Please New Enter Password: ");
            password = in.nextLine();
            numInt = 0;
            noValidPass = false;

            //Check length
            if (password.length() < 8) {
                System.out.println("-Password must Contain atleast 8 characters.");
                noValidPass = true;
            }

            //Check typof characters in password are letters and integers
            for (char c : password.toCharArray()) {
                if (!Character.isLetterOrDigit(c)) {
                    System.out.println("-Password must contain only numbers and letters.");
                    noValidPass = true;
                    break;
                }
                if (Character.isDigit(c)) {
                    numInt += 1;
                }
            }

            //Make sure there is atleast 2 numbers
            if (numInt < 2) {
                System.out.println("-Passwords must have atleast 2 numbers.");
                noValidPass = true;
            }
        }

        System.out.print("Password Saved.");
    }

}
