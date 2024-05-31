package Chapter_3;

import java.util.Scanner;

/**
 * Exercise_7
 * (Financial application: monetary units) Modify Listing 2.10, ComputeChange.
 * java, to display the nonzero denominations only, using singular words for single 
 * units such as 1 dollar and 1 penny, and plural words for more than one unit such as 2 dollars and 3 pennies.

 */
public class Exercise_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     System.out.print("Enter amount as decimal: ");
     double amount = scanner.nextDouble();

     int cents = (int) (amount * 100);
     int dollars = (cents / 100);
     cents %= 100;

     int quarters = (cents / 25);
     cents %= 100;

     int dimes = (cents / 10);
     cents %= 10;

     int nickels = cents / 5;
     cents%= 5;
     int pennies = cents;
     System.out.println("Your amount: " + amount + " consists of ");
     
     if (dollars > 0){
        if (dollars> 1)
          System.out.println(dollars + " dollars");
        else 
           System.out.println(dollars + " dollar");
     }
     if (quarters > 0){
        if (quarters> 1)
          System.out.println(quarters + " quaters");
        else 
           System.out.println(quarters + " quarter");
     }
     if (dimes > 0){
        if (dimes> 1)
          System.out.println(dimes + " dimes");
        else 
           System.out.println(dimes + " dime");
     }
     if (nickels > 0){
        if (nickels> 1)
          System.out.println(nickels + " nickels");
        else 
           System.out.println(nickels + " nickel");
     }
     if (pennies > 0){
        if (pennies> 1)
          System.out.println(pennies + " pennies");
        else 
           System.out.println(pennies + " penny");
     }

        scanner.close();
    }
}