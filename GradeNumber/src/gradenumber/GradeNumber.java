
package gradenumber;

import java.util.Scanner;


public class GradeNumber {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your Number");
        float grade = s.nextFloat();
        
        if(grade > 100){
            System.out.println(grade+" is invalide");
        }
        else if(grade >= 90){
            System.out.println(grade+" is A Grade");
        }
        else if(grade >= 80){
            System.out.println(grade+" is B Grade");
        }
        else if(grade >= 70){
            System.out.println(grade+" is C Grade");
        }
        else if(grade >= 60){
            System.out.println(grade+" is D Grade");
        }
        else if(grade < 60){
            System.out.println(grade+" is F Grade");
        }
       
        else{
            System.err.println(grade+" is F Grade");
            
        }  
    }
    
}
