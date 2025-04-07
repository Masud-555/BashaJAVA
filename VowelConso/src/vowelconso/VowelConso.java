
package vowelconso;

import java.util.Scanner;


public class VowelConso {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Latter");
        int letter = s.nextInt();
        
        if(letter == 'a'){
            System.out.println(letter+" is vowel");      
        }
         
        }
        else{
            System.out.println(letter+" is Consonent");
        }
        
    }
    
}
