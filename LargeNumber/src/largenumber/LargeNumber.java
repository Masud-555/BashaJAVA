
package largenumber;

import java.util.Scanner;


public class LargeNumber {

    
    public static void main(String[] args) {
        
         Scanner s = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        float input1 = s.nextFloat();

        System.out.println("Enter 2nd Number");
        float input2 = s.nextFloat();

        if (input1 > input2) {
            System.out.println(input1 + " This is Large Number");
        } else {
            System.out.println(input2 + " This is Large Number");
        }
        
    }
    
}
