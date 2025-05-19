
package threads;


public class Jam implements Runnable{
    
    private int num;

    public Jam() {
    }

    public Jam(int num) {
        this.num = num;
    }
    

    @Override
    public void run(){
  
        for(int i = 0; i <num; i++){
        
            System.out.println(num);
        }
  }
}
