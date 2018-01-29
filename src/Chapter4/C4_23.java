package Chapter4;

import java.util.Scanner;

/**
 * Determines net pay with tax deducted based on user inputed tax rates and
 * returns a little receipt in the console
 *
 * @author James Miller
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String name;
        double hours;
        double rate;
        double fedTax;
        double stateTax;
        double grossPay;
        double stateWithholds;
        double fedWithholds;
        double totalDeductions;
        double netPay;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = in.nextLine();
        System.out.print("Enter Hours Worked: ");
        hours = in.nextDouble();
        System.out.print("Enter payrate: ");
        rate = in.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        stateTax = in.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        fedTax = in.nextDouble();

        grossPay = hours * rate;
        double tempPay = grossPay;
        fedWithholds = grossPay * fedTax;
        stateWithholds = grossPay * stateTax;
        totalDeductions = stateWithholds + fedWithholds;
        grossPay -= totalDeductions;

        System.out.printf("Emplyee Name: " + name);
        System.out.printf("\nHours Worked: %.2f \n", hours);
        System.out.printf("Pay Rate: %.2f\n", rate);
        System.out.printf("Gross Pay: %.2f\n", tempPay);
        System.out.printf("Deductions: \n");
        System.out.printf("\t Federal Withholding: %.2f\n", fedWithholds);
        System.out.printf("\t State Withholding: %.2f\n", stateWithholds);
        System.out.printf("\t Total Deduction: %.2f\n", totalDeductions);
        System.out.printf("Net Pay: %.2f", grossPay);

    }

}
