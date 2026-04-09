package Week09Lab.Example01Mediator;

interface AirTrafficControl {
    void notify(Aircraft sender, String event);
    void registerAircraft(Aircraft aircraft);
}

