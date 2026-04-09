package Week09Lab.Example01Mediator;

abstract class Aircraft {
    protected String name;
    boolean landingStatus;
    protected AirTrafficControl controlTower;
    void landing(){
        controlTower.notify(this, "landing");
    }
    void takeOff(){
        controlTower.notify(this, "takeoff");
    }
}
