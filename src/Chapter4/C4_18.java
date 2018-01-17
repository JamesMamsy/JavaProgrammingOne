
package Chapter4;
import java.util.Scanner;
/**
 * Displays a major and grade based off inputed characters 
 * @author James Miller
 */
public class C4_18 {
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String result = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two Characters: ");
        String userInput = input.nextLine();
        char course = userInput.charAt(0);
        switch (course) {
            case 'M':
                result += "Mathematics ";
                break;
            case 'C':
                result += "Computer Science ";
                break;
            case 'I':
                result += "Information Technology ";
                break;
            default:
                result += "Invalid Input ";
                break;
        }
        
        String year = userInput.substring(1);
        int yearInt = Integer.parseInt(year);
        if(yearInt > 5){
            yearInt = 5;
        }
        String[] years = {"Freshman", "Sophomore", "Junior", "Senior", "Invalid Input"};
        if(!result.equals("Invalid Input ") && !years[yearInt - 1].equals("Invalid Input"))
            result += years[yearInt - 1];
        else 
            result = "Invalid Input";
        System.out.println(result);
    }
        
} 


