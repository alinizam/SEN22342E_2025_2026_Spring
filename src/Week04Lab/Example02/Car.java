package Week04Lab.Example02;

public class Car extends Vehicle {
    boolean airConditioning;
    boolean sunroof;
    String GPS;
    Car(IBuilder builder) {
        super(builder);
    }
    static class  builder implements IBuilder{
        boolean airConditioning;
        boolean sunroof;
        String GPS;

        @Override
        public IBuilder setAirConditioning(boolean airConditioning) {
            this.airConditioning = airConditioning;
            return this;
        }

        @Override
        public IBuilder setSunRoof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        @Override
        public IBuilder setGPS(String GPS) {
            this.GPS = GPS;
            return this;
        }

        @Override
        public boolean getAirConditioning() {
            return airConditioning;
        }

        @Override
        public boolean getSunRoof() {
            return sunroof;
        }

        @Override
        public String getGPS() {
            return GPS;
        }

        @Override
        public Vehicle build() {
            return new Car(this);
        }
    }
}
