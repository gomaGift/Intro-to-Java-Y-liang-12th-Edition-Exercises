package Chapter_2;
/*
 * (Financial application: calculate tips)
 *  Write a program that reads the subtotal and the gratuity rate and then computes the gratuity and total.
 *  For example, if the user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2s gratuity and $11.2 as total.
 * 
 */

import java.util.Scanner;

public class Exercise_5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total and gratuity rate");

        double subTotal = scanner.nextDouble();

        double gratuityRate = scanner.nextDouble() / 100; // gratuity is a percentage but requests for a whole number from user

        double gratuity = subTotal * gratuityRate;
        double total = gratuity + subTotal;

        System.out.println("Gratuity: $" + gratuity);
        System.out.println("Total: $" + total);




















        scanner.close();
    }
    
}
