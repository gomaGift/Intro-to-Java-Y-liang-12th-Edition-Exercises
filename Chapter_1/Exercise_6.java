package Chapter_1;
/*
 * (Summation of a series) Write a program that displays the result of
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10.
 */

public class Exercise_6 {
    public static void main(String[] args) {

        int summationSeries = 0;
        int i = 1, n = 10;

        for (; i <= n; i++)
          summationSeries += i;

        System.out.println(summationSeries);
        
    }
}
