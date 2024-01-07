package Chapter_2;
/*
 * (Convert square meter into ping) Write a program that converts square meter into ping. 
 * The program prompts the user to enter a number in square meter, converts it to ping, and displays the result.
 *  One square meter is 0.3025 ping.
 */

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number (square meter): ");

        double squareMeter = scanner.nextDouble();

        double ping = squareMeter * .3025;
        System.out.println(squareMeter + " Square Meter is " + ping + " ping");



        scanner.close();
    }
    
}
