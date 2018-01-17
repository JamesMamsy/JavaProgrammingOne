
package Chapter3;
import java.util.Scanner;

/**
 * Takes two numbers as input and spews random facts about them
 * @author James Miller
 */
public class P3 {
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
		double num1;
		double num2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		num1 = input.nextDouble();
		System.out.print("\n Enter Another Number: ");
		num2 = input.nextDouble();
		
		if(num1 < num2)
			System.out.println("The first number is less than the second");
		if (num1 > num2)
			System.out.println("The first number is greather than the second");
		if(num1 == num2)
			System.out.println("The first number is equal to the second");
		if(num1 <= num2)
			System.out.println("The first number is less than or eual to the second");
		if(num1 != num2)
			System.out.println("The first number is not equal to the second");
		if(num2 == 0)
			System.out.println("Cannot divide by zero");
		else if(num1/num2 < 1)
			System.out.println("Proper Fraction");
		else
			System.out.println("Improper Fraction");
		if(num1 >= 90)
			System.out.println("A");
		if(num1 >= 80)
			System.out.println("B");
		if(num1 >= 70)
			System.out.println("C");
		if(num1 >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
		if(num1 < 100 && num1 > 1)
			System.out.println("In Range");
		else
			System.out.print("Out of Range");
	}
}
