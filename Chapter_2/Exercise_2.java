package Chapter_2;
/*
 * (Compute the volume of a triangle) 
 * Write a program that reads in the length of sides of an equilateral triangle and computes the area and volume using 
 * the following formulas: area = sqrt(3)/4 (length of sides)^2
 * volume = area * length
 */

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of an equalateral triangle: ");
        
        double length = scanner.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(length, 2);
        double volume = area * length;

        System.out.println("Equalateral Triangle of length: " + length);
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);



        scanner.close();
        
    }
}
