package Chapter_1;
/*
 *  (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 * ■■ One birth every 7 seconds
 * ■■ One death every 13 seconds
 * ■■ One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years. 
 * Assume that the current population is 312,032,486, and one year has 365 days. 
 * Hint: In Java, if two integers perform division, the result is an integer. The fractional part is truncated. 
 * For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). 
 * To get an accurate result with the fractional part, one of the values involved in the division must be a number with a decimal point.
 *  For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */

public class Exercise_11 {
        static final double TOTAL_SECONDS_PER_YEAR = 60 * 60 * 24 * 365;
        static final double SECONDS_PER_BIRTH = 7.0;
        static final double SECONDS_PER_DEATH = 13.0;
        static  final double SECONDS_PER_IMMIGRATION = 45.0;
    public static void main(String[] args) {

        double currentPopulation = 312_032_486;
        double numberOfBirthsPerYear;
        double numberOfDeathsPerYear;
        double numberOfImmigrationPerYear;
    
       
        for (int i = 1; i <= 5; i++){
            
             numberOfBirthsPerYear = TOTAL_SECONDS_PER_YEAR * 1 / SECONDS_PER_BIRTH; 
             numberOfDeathsPerYear = TOTAL_SECONDS_PER_YEAR * 1 / SECONDS_PER_DEATH;
             numberOfImmigrationPerYear = TOTAL_SECONDS_PER_YEAR * 1 / SECONDS_PER_IMMIGRATION;

            currentPopulation += numberOfBirthsPerYear - numberOfDeathsPerYear + numberOfImmigrationPerYear;
            System.out.print("Population for year " + i + ": " );
            System.out.printf("%1.0f", currentPopulation); 
            System.out.println();
        }
    }
}
