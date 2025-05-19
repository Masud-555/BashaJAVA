
package threadsexam;


public class ThreadsExam {

   
    public static void main(String[] args) {
      
        Runnable r = new CharValuesTest("M", 10);
        Runnable r1 = new CharValuesTest("S", 20);
        Runnable r2 = new CharValuesTest("D", 20);
        
        Thread t = new Thread(r);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t.start();
        t1.start();
        t2.start();
     
    }
    
}
