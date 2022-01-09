import Flights.Plane;
import Flights.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.YT1300F);

    }
    @Test
    public void planeHasType(){
        assertEquals(PlaneType.YT1300F,plane.getType());
    }
    @Test
    public void planeHasWeight(){
        assertEquals(1000,plane.getWeight());
    }
    @Test
    public void planeHasCapacity(){
        assertEquals(500,plane.getCapacity());
    }
}
