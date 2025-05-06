
package mapsetandlistmethodse;

import java.util.HashMap;
import java.util.Map;


public class MapSetAndListMethodse {


    public static void main(String[] args) {
       
        Map<Integer,students> stuList = new HashMap<>();
        
        stuList.put(1, new students(101,"masud", "aasfd"));
        stuList.put(2, new students(102,"Imran", "adsfd"));
        stuList.put(3, new students(103,"Ishtiyaq", "acsfd"));
        stuList.put(4, new students(104,"Atik", "absfd"));
        
        
        System.out.println(stuList);
        
    }
    
}
