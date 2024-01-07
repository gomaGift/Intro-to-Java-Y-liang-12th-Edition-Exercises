package Chapter_2;
/*
 * (Convert mile to kilometer)
 *  Write a program that reads a mile in a double value from the console, converts it to kilometers, and displays the result. 
 * The formula for the conversion is as follows:
 * 1 mile = 1.6 kilometers
 */

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Miles: ");

        double miles = scanner.nextDouble();
        double kilometers = miles * 1.6;

        System.out.println(miles + " miles is "+ kilometers + " kilometers");

        scanner.close();
    }

}
