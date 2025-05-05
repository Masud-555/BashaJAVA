
package midexamoopandinheritance;


public class Vehicle {
    
    public String brand;
    public int speed;
    public boolean engeen;
    public boolean body;
    public double regularPrice;

    public Vehicle() {
    }

    public Vehicle(String brand, int speed, boolean engeen, boolean body, double regularPrice) {
        this.brand = brand;
        this.speed = speed;
        this.engeen = engeen;
        this.body = body;
        this.regularPrice = regularPrice;
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
    
    public String carDetails(){
    
    
        return " Brand Name: "+brand+"\n Speed: "+speed+"\n Regular Price: "+regularPrice;
    
    }
    
}
