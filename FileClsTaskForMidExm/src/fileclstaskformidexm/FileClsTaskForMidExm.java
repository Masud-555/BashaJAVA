
package fileclstaskformidexm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileClsTaskForMidExm {

    
    public static void main(String[] args) {
        
        
        File f = new File("C:\\Users\\Admin\\Desktop\\Mas.txt");
        
                    
        try {
            
            PrintWriter pw = new PrintWriter(f);
            
             pw.write("I Love Bangladesh \n");
            pw.println("My Name Is Masud ");
            pw.append("I am very good person.");
            
            pw.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileClsTaskForMidExm.class.getName()).log(Level.SEVERE, null, ex);
        }
                     
             
            try {
                
                
               Scanner s = new Scanner(f);
               
                 while (s.hasNext()) {
                System.out.println(s.nextLine());

            }
               
               
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileClsTaskForMidExm.class.getName()).log(Level.SEVERE, null, ex);
            }

                       
        } 
        
    } 
        
       
