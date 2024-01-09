package Chapter_2;
/*
*(Financial application: calculate interest)
* If you know the balance and the annual percentage interest rate,
* you can compute the interest on the next monthly payment using the following formula:
* interest = balance * (annualInterestRate/1200)
* Write a program that reads the balance and the annual percentage interest rate and
* displays the interest for the next month.
 */

import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {

        double balance;
        double annualPercentageInterestRate;
        double interestForNextMonth;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Balance: ");
        balance = scanner.nextDouble();

        System.out.print("Enter annual percentage interest rate as an integer: ");
        annualPercentageInterestRate = scanner.nextDouble();

        interestForNextMonth = balance * annualPercentageInterestRate / 1200;
        System.out.print("The interest is: ");
        System.out.printf("%.4f", interestForNextMonth);


    }
}
