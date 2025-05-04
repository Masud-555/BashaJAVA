
package fileobjectclstasksirimprtent;


public class Car extends Vehicle{
    
    public int numberOfDoor;

    public Car() {
    }

    public Car(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public Car(int numberOfDoor, String brand, int speed) {
        super(brand, speed);
        this.numberOfDoor = numberOfDoor;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
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
        
        System.out.println("Number of Door :"+numberOfDoor);
    }
    
    
    
}
