package midexamoopandinheritance;

public class VehicleBusTruckOOP {

    public static void main(String[] args) {

        Bus b = new Bus();

        b.setBrand("BMW");
        b.setSpeed(3000);
        b.setRegularPrice(5000000);

        b.setLight(10);
        System.out.println(b.carDetails());

    }

}
