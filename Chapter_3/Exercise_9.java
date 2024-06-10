package Chapter_3;

import java.util.Scanner;

/**
 * **3.9 (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) 
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, 
 * which is calculated from the other 9 digits using the following formula:
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) mod 11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
 *  Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros).
 * 
 */
public class Exercise_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // prompt user to enter the isbn first nine digits as a integer
        System.out.print("Enter an integer: ");

        // read it as a string
        String numString = scanner.nextLine();
        
        int checksum;
        int sum = 0;

        // get the sum of the products using the checksum formula
        for (int i = 0; i< numString.length(); i++){
            sum += ((i+1) * Character.getNumericValue(numString.charAt(i)));
        }

        // find the checksum
        checksum = sum % 11;

        if (checksum == 10)
           System.out.println("The ISBN-10 number is " + numString + "X");

        else
         System.out.println("The ISBN-10 number is " + numString + checksum);

        scanner.close();
        System.exit(0);
    }
}
