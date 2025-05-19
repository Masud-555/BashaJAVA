
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Aam implements Runnable{
    
   private int myTask;

    public Aam() {
    }

    public Aam(int myTask) {
        this.myTask = myTask;
    }

    public int getMyTask() {
        return myTask;
    }

    public void setMyTask(int myTask) {
        this.myTask = myTask;
    }
   
   
   
    
    @Override
      public void run(){
          System.out.println("Task" + myTask + "is running thread "+ Thread.currentThread().getName());
       try {
                      
           Thread.sleep(1000);
           
       } catch (InterruptedException ex) {
           System.out.println("Task" + myTask + " was intrupted");
           Logger.getLogger(Aam.class.getName()).log(Level.SEVERE, null, ex);
       }
        System.out.println("Task" + myTask + " completed by " + Thread.currentThread().getName());
  
  }
    
}
