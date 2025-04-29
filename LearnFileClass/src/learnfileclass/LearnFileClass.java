package learnfileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnFileClass {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\Admin\\Desktop\\EviPrac.txt");

       

//            System.out.println(f.exists());
//            System.out.println(f.length());
//            System.out.println(f.canRead());
//            System.out.println(f.canWrite());
//            System.out.println(f.lastModified());
//            System.out.println(f.isHidden());
            PrintWriter pw;
            try {
                pw = new PrintWriter(f);

                pw.write("I Am students of Java");
                pw.write("My Name Is Masud");
                pw.write("I am a bed  Brain Students");

                pw.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(LearnFileClass.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }


