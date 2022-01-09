import Flights.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Obi Wan Kenobi",2);
    }

    @Test
    public void hasName(){
        assertEquals("Obi Wan Kenobi",passenger.getName());
    }
    @Test
    public void hasBags(){
        assertEquals(2,passenger.getNoOfBags());
    }
}
