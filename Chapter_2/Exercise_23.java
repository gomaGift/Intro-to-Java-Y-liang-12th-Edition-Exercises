package Chapter_2;
/*
*(Cost of driving) Write a program that prompts the user to enter the distance to drive,
* the fuel efficiency of the car in miles per gallon,
* and the price per gallon then displays the cost of the trip.
 */

import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance to drive: ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the fuel efficiency: ");
        double fuelEfficiency = scanner.nextDouble();

        System.out.print("Enter the fuel price: ");
        double fuelPrice = scanner.nextDouble();

        double totalCostOfTrip = distance * fuelPrice;

        double actualCost = totalCostOfTrip / fuelEfficiency;

        System.out.print("The cost of trip of " + distance + "miles ");
        System.out.printf("%.2f", actualCost);

        scanner.close();

    }
}
