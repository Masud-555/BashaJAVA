
package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Threads {

    
    public static void main(String[] args) {
        
        ExecutorService excutor = Executors.newFixedThreadPool(4);
        
        for(int i =1; i <=10; i++){
            Runnable  myTask = new Aam();
            excutor.submit(myTask);
                
        }
        
        excutor.shutdown();
        
    }
    
}
