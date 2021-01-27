package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Passenger> passengerList = new ArrayList<>();

    public boolean AddPassenger(Passenger passenger){
        if(passenger.haveTicket()){
            passengerList.add(passenger);
            return true;
        }
        return false;
    }
    public List<Passenger> getPassengerList() {
        return passengerList;
    }
}
