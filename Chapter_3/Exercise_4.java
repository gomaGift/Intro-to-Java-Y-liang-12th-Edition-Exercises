package Chapter_3;


/**
 * Exercise_4
 *  **3.4 (Random Color) Write a program that randomly generates an integer between 1 and 7
 *  and displays the name of a color in the rainbow—violet, indigo, blue, green, yellow, orange,
 *  and red—for numbers 1, 2, 3, . . . , 7 accordingly.
 */
public class Exercise_4 {

public static void main(String[] args) {

    int randomNumber = 1 + (int)(Math.random() * 7);

    switch (randomNumber) {
        case 1: System.out.println("Color number is " + randomNumber + " and Color Red");
            
            break;
        case 2: System.out.println("Color number is " + randomNumber + " and Color Orange");
            break;
        case 3:System.out.println("Color number is " + randomNumber + " and Color Yello");
            
            break;
        case 4:System.out.println("Color number is " + randomNumber + " and Color Green");
            
            break;
        case 5:System.out.println("Color number is " + randomNumber + " and Color Blue");
            
            break;
        case 6:System.out.println("Color number is " + randomNumber + " and Color Indigo");
            
            break;
        case 7:System.out.println("Color number is " + randomNumber + " and Color Violet");
            
            break;
    
        default:
            break;
    }


}
    
}