package fileclasseven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileClassEven {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\Admin\\Desktop\\Even.txt");

        try {
            PrintWriter pw = new PrintWriter(f);

            for (int i = 1; i <= 50; i++) {

                if (i % 2 == 0) {
                    pw.println(i);

                }
            }

            pw.close(); // Always close the writer
            System.out.println("Even numbers written successfully!");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileClassEven.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
