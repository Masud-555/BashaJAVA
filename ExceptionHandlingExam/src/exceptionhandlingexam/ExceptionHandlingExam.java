package exceptionhandlingexam;

import java.util.Scanner;

public class ExceptionHandlingExam {

    public static void main(String[] args) {
        
         Scanner s = new Scanner(System.in);
          

        try {
//            int result = 10/0;
//            System.out.println(result);
//
//           System.out.println("Enter number");
//          double num1 = s.nextDouble();
//          
//          System.out.println("Enter number");
//          double num2 = s.nextDouble();
//            
//           double result = num1 / num2;
//            System.out.println(result);
            
            
            System.out.println("Enter 1st number");
            int n1 = s.nextInt();
            System.out.println(n1);
            

        } catch (ArithmeticException e) {
            
            System.out.println(e);
        }

    }

}
