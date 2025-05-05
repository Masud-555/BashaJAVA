
package midexamoopandinheritance;


public class Bus extends Vehicle{
    
    public int weight;
    public int seat;
    public int light;

    public Bus() {
    }

    public Bus(int weight, int seat, int light) {
        this.weight = weight;
        this.seat = seat;
        this.light = light;
    }

    public Bus(int weight, int seat, int light, String brand, int speed, boolean engeen, boolean body, double regularPrice) {
        super(brand, speed, engeen, body, regularPrice);
        this.weight = weight;
        this.seat = seat;
        this.light = light;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getLight() {
        return light;
    }

    public void setLight(int light) {
        this.light = light;
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

    public boolean isEngeen() {
        return engeen;
    }

    public void setEngeen(boolean engeen) {
        this.engeen = engeen;
    }

    public boolean isBody() {
        return body;
    }

    public void setBody(boolean body) {
        this.body = body;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    @Override
    public String carDetails() {
        
        return  " Brand Name: "+brand+"\n Speed: "+speed+"\n Regular Price: "+regularPrice+"\n Number of Seat: "+seat+"\n Number of Light : "+light;
    }


    
    
}
