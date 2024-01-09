package Chapter_2;
/*
*(Financial application: calculate future investment value)
*  Write a program that reads in investment amount, annual interest rate, and number of years
* and displays the future investment value using the following formula:
* futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
 */

import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {

        double investmentAmount;
        double annualInterestRate;
        double monthlyInterestRate;
        int numberOfYearsOfInvestment;
        double futureInvestmentValue;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        investmentAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate: ");
        annualInterestRate = scanner.nextDouble() / 100;
        monthlyInterestRate= annualInterestRate / 12;

        System.out.print("Enter years of investment: ");
        numberOfYearsOfInvestment = scanner.nextInt();

        futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYearsOfInvestment * 12);
        System.out.printf("Future investment is: %.2f", futureInvestmentValue);
    }
}
