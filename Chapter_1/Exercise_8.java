package Chapter_1;
/*
 * (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle
 *  that has a radius of 6.5 using the following formula:
 * p = 3.14159
 * perimeter = 2 * radius * p
 * area = radius * radius * p
 */

public class Exercise_8 {
    private static final double PI = 3.14159;
    
    public static void main(String[] args) {

        double circleRadius = 6.5;
        double perimeter = 2 * circleRadius * PI;
        double area = circleRadius *circleRadius * PI;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
