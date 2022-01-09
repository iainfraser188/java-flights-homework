import Employees.CabinCrewMember;
import Employees.CrewRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember(CrewRank.FirstOfficer,"Chewbacca");
    }

    @Test
    public void crewHasRank(){
        assertEquals(CrewRank.FirstOfficer,cabinCrewMember.getRank());
    }

    @Test
    public void CrewHasName(){
        assertEquals("Chewbacca", cabinCrewMember.getName());
    }

    @Test
    public void crewMessage(){
        assertEquals("Roooarrgh ur roo",CabinCrewMember.getMessage());
    }


}
