package Chapter_2;
/*
 * (Print a table) 
 * Write a program that displays the following table. Calculate the middle point of two points.
 *    a        b       Middle Point
 * (0, 0)    (2, 1)     (1.0, 0.5)
 * (1, 4)   (4, 2)     (2.5, 3.0)
 * (2, 7)   (6, 3)     (4.0, 5.0)
 * (3, 9)   (10, 5)    (6.5, 7.0)
 * (4, 11)  (12, 7)    (8.0, 9.0)
 */

public class Execise_18 {

    public static void main(String[] args) {

        int ax = 0, ay = 0, bx = 2, by = 1;

        int incrementAy = 4;
        int incrementBx = 2;

      
        
        System.out.println("   a           b            Middle Point");
        int i =0;
        
        while (i < 5) {
            double midpointXCord = findMidPointCord(ax, bx);
            double midpointYCord = findMidPointCord(ay, by);
           
             System.out.printf("(%d, %2d)     (%2d, %d)          (%.1f, %.1f)",ax, ay, bx, by, midpointXCord, midpointYCord);
             System.out.println();
      
             ax += 1;
             ay += incrementAy; 
             if (i < 2)  
               incrementAy--;
             
             
             bx += incrementBx;
             if (i == 1)
                incrementBx = 4;
             else {
                incrementBx = 2;
             }


             if (i < 2){
                by += 1;
             }
             else {
                by += 2;
             }
           i++;
             


        }
        
    }

    private static double findMidPointCord(int ay, int by) {
        return (ay + by)/2.0;
    }
    
}
