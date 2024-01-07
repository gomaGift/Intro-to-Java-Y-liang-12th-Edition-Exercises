package Chapter_2;
/*
 * (Convert meters into feet)
 *  Write a program that reads a number in meters, converts it to feet, and displays the result. 
 * One meter is 3.2786 feet
 */

import java.util.Scanner;

public class Exercise_3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number(meters): ");
        final double METER_TO_FEET = 3.2786;
        
        double numberInMeters = scanner.nextDouble();
        double numberInFeet = numberInMeters * METER_TO_FEET;
        System.out.println(numberInMeters+ " meters is "+ numberInFeet +" feet");
        scanner.close();
    }
}
