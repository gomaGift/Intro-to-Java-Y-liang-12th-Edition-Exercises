package Chapter_2;
/*
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight.
 *  It can be calculated by taking your weight in kilograms and dividing, by the square of your height in meters.
 *  Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
 *  Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters. 
 */

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter weight in pounds: ");
    double weightPounds = scanner.nextDouble();

    System.out.print("Enter height in inches: ");
    double heightInches = scanner.nextDouble();

    double weightKgs = weightPounds * 0.45359237;

    double heightMeters = heightInches *  0.0254;

    double BMI = weightKgs / Math.pow(heightMeters, 2);

    System.out.printf("Weight %.1f\nHeight %.1f\nBMI %.4f", weightKgs, heightMeters, BMI);
    }
}
