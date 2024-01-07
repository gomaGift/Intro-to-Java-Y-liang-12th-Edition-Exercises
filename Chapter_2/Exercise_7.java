package Chapter_2;
/*
 * (Find the number of years) 
 * Write a program that prompts the user to enter the minutes (e.g., 1 billion), 
 * and displays the number of years and remaining days for the minutes. 
 * For simplicity, assume that a year has 365 days. 
 * sample run:
 *  Enter the number of minutes: 1000000000 
 * 1000000000 minutes is approximately 1902 years and 214 days 
 */

import java.util.Scanner;

public class Exercise_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");

        long minutes = scanner.nextLong();

        long numYears = minutes * 1/60 * 1/24 * 1/ 365; // convert from minutes to hours to days to year
        long remDays = minutes * 1/60 * 1/24 * 1 % 365; // % operator divides and retains the number of remaining days after getting the years
 
        System.out.println(minutes + " minutes is approximately " + numYears + " years and " + remDays + " days");
        scanner.close();
        
    }
    
}
