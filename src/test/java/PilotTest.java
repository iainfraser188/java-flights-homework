import Employees.CrewRank;
import Employees.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot(CrewRank.Captain,"Han Solo","LC5496");
    }

    @Test
    public void pilotHasRank(){
        assertEquals(CrewRank.Captain,pilot.getRank());
    }
    @Test
    public void pilotHasName(){
        assertEquals("Han Solo",pilot.getName());
    }
    @Test
    public void pilotHasLicenceNo(){
        assertEquals("LC5496",pilot.getLicence());
    }
    @Test
    public void pilotCanFly(){
        assertEquals("Yeah I'am a Pilot",pilot.canFly());
    }
}
