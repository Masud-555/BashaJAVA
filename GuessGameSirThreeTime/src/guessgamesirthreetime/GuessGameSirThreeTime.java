
package guessgamesirthreetime;

import java.util.Scanner;


public class GuessGameSirThreeTime {

    
    public static void main(String[] args) {
       
         Scanner s =new  Scanner(System.in);
        
        System.out.println("Enter Your Guess Number");
        
        int userInput = s.nextInt();
        
        int randomNumber = (int)(Math.random()*10);
        
        int count =1;
        
        while(count < 3){
             
            if(userInput == randomNumber){
                System.out.println("You win");
                break;
            }
            else if(userInput > randomNumber){
                System.out.println("You input higher number");
                System.out.println("------------------------");
                System.out.println("Enter Your Guess Number");
                userInput = s.nextInt();
                
            }else if(userInput < randomNumber){
                System.out.println("You input higher number");
                System.out.println("------------------------");
                System.out.println("Enter Your Guess Number");
                userInput = s.nextInt();
            }
            if(count == 2){
                System.out.println("better luck next time");
            }
            count++;
        }
        
    }
    
}
