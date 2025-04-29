package vehicleclsobjectgetprice10percent;

public class VehicleTruck extends Vehicle {

    int weight;

    public VehicleTruck() {
    }

    public VehicleTruck(int weight) {
        this.weight = weight;
    }

    public VehicleTruck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        
        if (weight > 2000) {
           
            return regularPrice - (regularPrice * 0.1);
        } else {

            return regularPrice;
        }

    }

}
