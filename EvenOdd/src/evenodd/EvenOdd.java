
package evenodd;

import java.util.Scanner;


public class EvenOdd {


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter number");
        
        int input = s.nextInt();
        
        if(input % 2 == 0){
            System.out.println("This is Even Number");
        }
        else{
            System.out.println("This is Odd Number");
        }
    }
    
}
