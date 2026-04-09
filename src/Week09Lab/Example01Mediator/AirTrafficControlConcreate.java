package Week09Lab.Example01Mediator;

import java.util.ArrayList;

public class AirTrafficControlConcreate implements AirTrafficControl {

    ArrayList<Aircraft> airCrafts=new ArrayList<>();
    @Override
    public void notify(Aircraft sender, String event) {
        boolean allowLanding=true;
        if(event.equals("takeoff")){
            sender.landingStatus=false;
            return;
        }
        for (Aircraft aircraft : airCrafts) {
            if(aircraft.landingStatus)
                allowLanding=false;
        }
        if (allowLanding) {
            sender.landingStatus=true;
            System.out.println("Air Traffic Control allows landing");
        }else{

            System.out.println("Another airctaft is landing");
        }
    }

    @Override
    public void registerAircraft(Aircraft aircraft) {
        airCrafts.add(aircraft);
    }
}
