package Chapter_1;
/*
 * write a program that estimates the value of pi
 */

public class Exercise_7 {

    public static void main(String[] args) {
        
        double pi1 =  4 * (1.0 - 1.0/3+ 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        double pi2 =4 * (1.0 - 1.0/3+ 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);

    

        System.out.println(pi1);
        System.err.println(pi2);
        System.out.println(Math.PI);
    }
    
}
