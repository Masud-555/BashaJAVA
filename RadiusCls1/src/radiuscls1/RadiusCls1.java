
package radiuscls1;

import java.util.Scanner;


public class RadiusCls1 {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        double areaOfCircle;
        
        System.out.println("Enter Radius number");
        double radius = s.nextDouble();
        
        if(radius <= 0){
        System.out.println("pls enter more than 0 zero");
        radius =s.nextDouble();
        areaOfCircle =Math.PI*Math.pow(radius, 2);
        }
        else{
            areaOfCircle = Math.PI*Math.pow(radius, 2);
        }
        
        System.out.println(areaOfCircle);
    }
    
}
