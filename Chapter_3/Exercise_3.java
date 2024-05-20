package Chapter_3;

import java.util.Scanner;

/**
 * Exercise_3
 * (Algebra: solve 2 * 2 linear equations)
 *  A linear equation can be solved using Cramer’s rule given in Programming Exercise 1.13.
 *  Write a program that prompts the user to enter a, b, c, d, e, and f and displays the result.
 *  If ad- bc is 0, report that “The equation has no solution.
 */
public class Exercise_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the a, b, c, d, e, f: ");
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        double determinant = a*d - b*c;
        if (determinant == 0){
            System.out.println("The equation has no solution");
            System.exit(0);
        }

        double x = (e*d - b*f)/determinant;
        double y = (a*f - e*c)/determinant;

        System.out.println("x is "+ x +" and y is " + y);
        System.exit(0);
        



























        scanner.close();
    }
    
}