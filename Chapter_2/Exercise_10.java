package Chapter_2;
/*
 * (Science: calculating energy) 
 * Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature.
 * Your program should prompt the user to enter the amount of water in kilograms and the initial and final temperatures of the water.
 * The formula to compute the energy is Q = M * (finalTemperature – initialTemperature) * 4184
 * where M is the weight of water in kilograms, initial and final temperatures are in degrees Celsius, and energy Q is measured in joules.
 */

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        
        double M; // kilograms of water 
        double initialTemperature;
        double finalTemperature;
        double Q; // energy

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        M = scanner.nextDouble();

        System.out.print("Enter initial Temperature: ");
        initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature: ");
        finalTemperature = scanner.nextDouble();

        Q = M * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The Energy is "+ Q);
        
        scanner.close();

    }
}
