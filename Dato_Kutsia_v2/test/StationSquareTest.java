import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StationSquareTest {
    @Test
    public void Test(){
        Passenger gio = new Passenger("Gio",true);
        Passenger nika = new Passenger("Nika",false);
        Passenger ana = new Passenger("Ana",true);
        Train train = new Train();
        assertEquals(true,gio.haveTicket());
        assertEquals(true,train.AddPassenger(gio));
        assertEquals(false,train.AddPassenger(nika));
        assertEquals(true,train.AddPassenger(ana));
        assertEquals(2,train.getPassengerList().size());
    }
}
