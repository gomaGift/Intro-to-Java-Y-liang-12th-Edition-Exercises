package Chapter_3;

import java.util.Scanner;

/**
 * SolveQuadraticEquation
 * The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained using the following formula:
 * r1 = (-b + sqr(b^2- 4ac))/2a
 * r2 = (-b 2 sqr(b^2- 4ac))/2a
 * b^2- 4ac is called the discriminant of the quadratic equation.
 * If it is positive, the equation has two real roots. If it is zero, the equation has one root.
 * If it is negative, the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant.
 * If the discriminant is positive, display two roots. If the discriminant is 0, display one root.
 * Otherwise, display “The equation has no real roots.”Note you can use Math.pow(x, 0.5) to compute sqr(x).
 */
public class SolveQuadraticEquation {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(" Enter the a,b c: ");

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    
    double determinant = b * b - 4*a*c;
    
    if (determinant > 0){
        double root1 =( -b + Math.sqrt(determinant))/(2.0 * a) * 100/100.0 ;
        double root2 =( -b - Math.sqrt(determinant))/(2.0 * a)* 100/100.0 ;
        System.out.println("Determinant greater than 0, two roots");
        System.out.printf("Root 1: %.4f Root 2: %.4f"  ,root1,root2);
    }
    else if (determinant < 0){
        double root2 =( -b - Math.sqrt(determinant))/(2.0 * a)* 100.0/100.0 ;
        System.out.println("Determinant less than 0, one root");
        System.out.print( "Root 2: " + root2);
    }

    else 
    {  System.out.println("Determinant: " + determinant + "Equal to zero");
      System.out.println("No real roots");}





















    scanner.close();
    
   }
}
