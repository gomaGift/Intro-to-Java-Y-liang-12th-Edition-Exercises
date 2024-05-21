package Chapter_3;

import java.util.Scanner;

/**
 * Exercise_5
 * (Find future dates) Write a program that prompts the user to enter an integer for today’s day of the week
 *  (Sunday is 0, Monday is 1, . . . , and Saturday is 6).
 *  Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
 */
public class Exercise_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day of the week: ");
        int dayOfWeek = scanner.nextInt();
        

        System.out.print("Enter the number of days after today: ");
        int numberOfDaysAfterToday = scanner.nextInt();


        int totalDays = dayOfWeek + numberOfDaysAfterToday;
        int dayOfWeekAfterEnteredNumberOfDays = totalDays % 7;

        switch (dayOfWeek) {
            case 0: System.out.print("Today is Sunday and the future Day is ");
                
                break;
            case 1:System.out.print("Today is Monday and the future Day is ");
                
                break;
            case 2:System.out.print("Today is Tuesday and the future Day is ");
                
                break;
            case 3:System.out.print("Today is Wednesday and the future Day is ");
                
                break;
            case 4:System.out.print("Today is Thursday and the future Day is ");
                
                break;
            case 5:System.out.print("Today is Friday and the future Day is ");
                
                break;
            case 6:System.out.print("Today is Saturday and the future Day is ");
                
                break;
        
            default: System.out.print("Day of the week invalid "); System.exit(1);
                break;
        }

        switch (dayOfWeekAfterEnteredNumberOfDays) {
            case 0: System.out.print("Sunday");
                
                break;
            case 1:System.out.print("Monday");
                
                break;
            case 2:System.out.print("Tuesday");
                
                break;
            case 3:System.out.print("Wednesday");
                
                break;
            case 4:System.out.print("Thursday");
                
                break;
            case 5:System.out.print("Friday");
                
                break;
            case 6:System.out.print("Saturday");
                
                break;
        
            default: 
                break;
        }


        scanner.close();

    }
}