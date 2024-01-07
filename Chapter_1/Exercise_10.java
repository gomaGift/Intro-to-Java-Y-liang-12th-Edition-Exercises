package Chapter_1;
/*
 *  (Average speed in miles) Assume that a runner runs 15 kilometers in 50 minutes and 30 seconds.
 *  Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
 */

public class Exercise_10 {
    public static void main(String[] args) {

        int distanceKilometers = 15;
        int timeMinutes = 50;
        int timeSeconds = 30;

        double timeDistanceMiles = distanceKilometers * 1.0/ 1.6;
        double timeHours = 1.0/60 *  (timeMinutes + (1 / 60 * timeSeconds));

        double speedMiles = timeDistanceMiles / timeHours;
        System.out.println("Average Speed In Miles per Hour: " + speedMiles + " Miles/H");
        
    }
}
