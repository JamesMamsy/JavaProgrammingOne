
package Chapter2;
import java.util.Scanner;
/**
 * Determines total cost of meal with x cost of entree, drinks, etc; then adds tax and displays total. X being user inputed.
 * @author James Miller
 */
public class P2 {
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float mealPrice;
        float drinkPrice;
        float dessertPrice;
        float subTotal;
        double salesTax;
        double tip;
        double total;
        System.out.print("Enter cost of entree: ");
        mealPrice = in.nextFloat();
        System.out.print("Enter cost of drink: ");
        drinkPrice = in.nextFloat();
        System.out.print("Enter cost of dessert: ");
        dessertPrice = in.nextFloat();
        subTotal = mealPrice + drinkPrice + dessertPrice;
        salesTax = subTotal * 0.1;
        total = salesTax + subTotal;
        tip = total * .15;
        total = subTotal + tip;
        
        System.out.println("Meal: $" + subTotal + "\nTax: $" + salesTax + "\nTip: $" + tip + "\nTotal: $"+ total);
        
                
    }
}
