package Chapter_2;
/*
 * (Geometry: distance of two points) 
 * Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance. 
 * The formula for computing the distance is sqrt((x2 - x1)^2 + (y2 - y1)^2)
 * Note you can use Math.pow(a, 0.5) to compute sqrt(a).
 */

import java.util.Scanner;

public class Exercise_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two points: ");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double differenceXCordSqrd = Math.pow(x1 - x2, 2);
        double differenceYCordSqrd = Math.pow(y1 - y2, 2);

        double distance = Math.pow(differenceXCordSqrd + differenceYCordSqrd, .5);
        System.out.printf("The distance between (%.1f, %.1f) and (%.1f, %.1f) is %.2f", x1, y1,x2, y2, distance);

        scanner.close();


    }

}
