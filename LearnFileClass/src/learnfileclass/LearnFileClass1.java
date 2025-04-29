
package learnfileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LearnFileClass1 {
    
     public static void main(String[] args) {
     
     File f = new File("C:\\Users\\Admin\\Desktop\\MasudFile.txt");
     
     
         try {
             PrintWriter pw = new PrintWriter(f);
             
             pw.write("Rahim mia Is a Lover Man");
             pw.write("Rahim mia Is a Lover Man");
         }
         
         catch (FileNotFoundException ex) {
             Logger.getLogger(LearnFileClass1.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     
     
     }
    
}
