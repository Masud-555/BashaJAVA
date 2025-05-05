
package midexamoopandinheritance;

import java.util.Scanner;


public class MidExamOOPAndInheritance {

    
    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
        
        try {
            System.out.println("Enter 1st number");
            int n1 = s.nextInt();
            
            System.out.println("Enter 2nd number");
            int n2 = s.nextInt();
            
            int result = n1 / n2;
            System.out.println(result);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
