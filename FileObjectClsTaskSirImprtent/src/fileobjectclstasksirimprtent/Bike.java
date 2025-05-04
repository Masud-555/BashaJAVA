
package fileobjectclstasksirimprtent;


public class Bike extends Vehicle{
    
    public int hasCarrier;

    public Bike() {
    }

    public Bike(int hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public Bike(int hasCarrier, String brand, int speed) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public int getHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(int hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void vehicleCarBike() {
        super.vehicleCarBike(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        System.out.println("Has Carrier :"+hasCarrier);
    }
    
    
    
}
