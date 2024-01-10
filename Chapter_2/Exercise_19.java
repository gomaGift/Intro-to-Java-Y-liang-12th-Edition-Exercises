package Chapter_2;
/*
 * (Geometry: area of a triangle) 
 * Write a program that prompts the user to enter three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its area. 
 * The formula for computing the area of a triangle is 
 * s = (side1 + side2 + side3)/2;
 * area = sqrt(s(s - side1)(s - side2)(s - side3))
 */

import java.util.Scanner;

public class Exercise_19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double s;
        double area;
        double side1;
        double side2;
        double side3;

        // Triangle coordinates
        double x1;
        double y1;

        double x2;
        double y2;

        double x3;
        double y3;

        System.out.print("Enter x1: ");
        x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        y2 = input.nextDouble();

        System.out.print("Enter x3: ");
        x3 = input.nextDouble();
        System.out.print("Enter y3: ");
        y3 = input.nextDouble();

        side1 = findLegthofSide(x1, y1, x2, y2);
        side2 = findLegthofSide(x2, y2, x3, y3);
        side3 = findLegthofSide(x1, y1, x3, y3);

        s = (side1 + side2 + side3) / 2;
        // Finds the area of a scalene triangle(triangle with all differnt sides) aka Heron's formula
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); 

        System.out.printf("The area of is: %.2f", area);

        input.close();

    }

    private static double findLegthofSide(double x2, double y2, double x3, double y3) {
        return Math.sqrt(Math.pow(x2 - x3 , 2) + Math.pow(y2 - y3, 2));
    }

}
