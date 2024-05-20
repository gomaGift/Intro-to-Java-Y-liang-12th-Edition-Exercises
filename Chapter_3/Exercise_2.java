package Chapter_3;

import java.util.Scanner;

/**
 * Exercise_2
 * (Game: multiply three numbers) The program in Listing 3.1, Addition Quiz.java, 
 * generates two integers and prompts the user to enter the sum of these two integers.
 * Revise the program to generate three single-digit integers and prompt the user to enter 
 * the multiplication of these three integers
 */
public class Exercise_2 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            // generate 3 single-digit integers
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            int number3 = (int)(Math.random() * 10);

            int product = number1 * number2 * number3;

            int productGuess = -1;
            
            while (productGuess != product) {
                System.out.print("Guess the product: ");
                productGuess = scanner.nextInt();
                System.out.println("product: " +product);
                System.out.println("productGuess: " + productGuess);
                if (productGuess == product){
                    System.out.println("You guessed correctly the product is: "+ product);
                    System.exit(0);
                }
            else if (productGuess > product){
                System.out.println("Product Guess greater than actual Product");
            }
            else {
                System.out.println("product guess is less than the actual product");
            }
                
            }
            scanner.close();

        }
}