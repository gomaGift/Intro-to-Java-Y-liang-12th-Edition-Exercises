package Chapter_1;
/*
 * 1.12 (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40minutes, and 35 seconds. 
 * Write a program that displays the average speed in kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
 */

public class Exercise_12 {
    public static void main(String[] args) {
        int distanceMiles = 24;
        int timeHours = 1;
        int timeMinutes = 40;
        int timeSeconds = 35;

        double distanceKilos = distanceMiles * 1.6;
        double totalTimeHours = timeHours +  (timeMinutes * 1.0/60) + (timeSeconds * 1.0/3600);

        double speed = distanceKilos / totalTimeHours;
        System.out.println("Average Speed in kilos per hour is: " + speed + " Km/h");
    }
}

