package Week04Lab.Example02;

public class Vehicle {
    boolean airConditioning;
    boolean sunroof;
    String GPS;
    Vehicle(IBuilder builder) {
        airConditioning = builder.getAirConditioning();
        sunroof = builder.getSunRoof();
        GPS = builder.getGPS();
    }
}
