
package vehicleclsobjectgetprice10percent;


public class VehicleClsObjectGetPrice10Percent {

    
    public static void main(String[] args) {
        
        
        Vehicle v = new VehicleTruck();
        v.setRegularPrice(5000);
        v.setWeight(2001);
        System.out.println(v.getSalePrice());
       
    }
    
}
