package Week04Lab.Example02;

public interface IBuilder {
    IBuilder setAirConditioning(boolean airConditioning);
    IBuilder setSunRoof(boolean sunroof);
    IBuilder setGPS(String GPS);
    boolean getAirConditioning();
    boolean getSunRoof();
    String getGPS();
    Vehicle build();
}
