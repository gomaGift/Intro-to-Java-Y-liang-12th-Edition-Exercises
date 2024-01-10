package Chapter_2;

import java.util.Scanner;

/*
 * (Geometry: area of a hexagon) 
 *  Write a program that prompts the user to enter the side of a hexagon and displays its area.
 *  The formula for computing the area of a hexagon is Area = 3/2*sqrt(3)* s^2 where s is the length of a side.
 */
public class Exercise_16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the the length of the side of the hexagon: ");

        double side = scanner.nextDouble();
        double area = 3 * Math.sqrt(3) / 2 * Math.pow(side, 2);
        
        System.out.printf("The Area is: %.4f", area);
        scanner.close();
    }
}
