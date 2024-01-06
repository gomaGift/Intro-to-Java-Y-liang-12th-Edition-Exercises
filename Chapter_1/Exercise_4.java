package Chapter_1;
/*
 *  Write a program that displays the following table:
 */


public class Exercise_4 {
    public static void main(String[] args) {

        System.out.printf("%-5s%-5s%-5s%-5s%n", "a", "a^2", "a^3", "a^4");
        for (int i = 1; i <= 4; i++){
            System.out.printf("%-5s%-5s%-5s%-5s%n" ,i, i*i,  i*i*i,  i*i*i*i);
        }
        
    }
}
