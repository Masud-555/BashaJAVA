
package threadsexam;


public class CharValuesTest implements Runnable{
    
    private String letters;
    private int times;

    public CharValuesTest(String letters, int times) {
        this.letters = letters;
        this.times = times;
    }
    
    

    @Override
    public void run() {
        
        for(int i = 0; i <this.times; i++){
        
            System.out.println(" "+letters);
        
        }


    }
    
}
