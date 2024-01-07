package Chapter_2;
/*
 * (Multiply the digits in an integer) 
 * Write a program that reads an integer between 0 and 1000 and multiplies all the digits in the integer. 
 * For example, if an integer is 932, the multiplication of all its digits is 54.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. 
 * For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



    System.out.print("Enter the an integer between 0 and 1000: ");

    int integer = scanner.nextInt();
    int toExtract = integer;
    
    int product = 1;

    while (toExtract  > 0){
        int digit = toExtract % 10;

        product *= digit;
        toExtract /= 10;
    }

    System.out.print("The product of the digits in " + integer + "  is " +product);























        scanner.close();
    }
}
