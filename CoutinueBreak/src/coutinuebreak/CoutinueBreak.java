
package coutinuebreak;


public class CoutinueBreak {

    public static void main(String[] args) {
      
        int targetaValue = 50;
        int count = 1;
        
        while (count <= targetaValue){
            
            if(count % 3 ==0 && count % 5 ==0){
                count++;
                continue;
            }
            System.out.println("nom is "+count);
            count++;
            
        }
        
        
    }
    
}
