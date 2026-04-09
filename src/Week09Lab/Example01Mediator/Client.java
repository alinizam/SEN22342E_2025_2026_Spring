package Week09Lab.Example01Mediator;

public class Client {
    public static void main(String[] args) {
        AirTrafficControl tower=new AirTrafficControlConcreate();
        Aircraft a1=new AircraftConcreate(tower);
        Aircraft a2=new AircraftConcreate(tower);
        tower.registerAircraft(a1);
        tower.registerAircraft(a2);
        a1.landing();
        a2.landing();
        a1.takeOff();
        a2.landing();

    }
}
