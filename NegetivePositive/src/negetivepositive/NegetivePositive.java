package negetivepositive;

import java.util.Scanner;

public class NegetivePositive {

    public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
       
        System.out.println("Enter number");
        
        float number = s.nextFloat();
        
        if(number > 0){
            System.out.println(number+" is Positive Number");
        }
        else if(number < 0){
            System.out.println(number+" is Negetive Number");
        }
        else{
            System.out.println(number+" is Zero Number");
        }
        

    }

}
