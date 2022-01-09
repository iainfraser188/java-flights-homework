import Employees.CabinCrewMember;
import Employees.CrewRank;
import Employees.Pilot;
import Flights.Flight;
import Flights.Passenger;
import Flights.Plane;
import Flights.PlaneType;
import org.junit.Before;
import org.junit.Test;

import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private Pilot pilot;
    private CabinCrewMember crewMember;
    private ArrayList<CabinCrewMember> crewList;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private ArrayList<Passenger> passengerList;
    private Plane plane;

    @Before
    public void before() {
        pilot = new Pilot(CrewRank.Captain, "Han Solo", "R2D2");
        crewMember = new CabinCrewMember(CrewRank.FirstOfficer, "Chewbacca");
        crewList = new ArrayList<>();
        crewList.add(crewMember);
        passenger1 = new Passenger("Obi Wan Kennobi", 2);
        passenger2 = new Passenger("Luke Skywalker", 1);
        passenger3 = new Passenger("Princess Leia",5);
        passenger4 = new Passenger("C3PO",1);
        passengerList = new ArrayList<>();
        passengerList.add(passenger1);
        passengerList.add(passenger2);
        plane = new Plane(PlaneType.YT1300F);
        flight = new Flight(pilot, crewList, passengerList, plane, "A1", "Alderaan", "Mos Eisley", "A Long Time Ago");
    }

    @Test
    public void flightHasPilot(){
        assertEquals(pilot,flight.getPilot());
    }
    @Test
    public void flightHasCrew(){
        assertEquals(1,crewList.size());
    }
    @Test
    public void flightHasPassengers(){
        assertEquals(2,passengerList.size());
    }
    @Test
    public void flightHasPlane(){
        assertEquals(plane,flight.getPlane());
    }
    @Test
    public void flightHasFlightNo(){
        assertEquals("A1",flight.getFlightNo());
    }
    @Test
    public void flightHasDepartureAirport(){
        assertEquals("Mos Eisley", flight.getDepartureAirport());
    }
    @Test
    public void flightHasDestination(){
        assertEquals("Alderaan",flight.getDestination());
    }
    @Test
    public void flightHasTime(){
        assertEquals("A Long Time Ago",flight.getTime());
    }
    @Test
    public void canReturnAvailableSeats(){
        assertEquals(13,flight.availableSeats());
    }
    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger3);
        assertEquals(3,passengerList.size());
    }
    @Test
    public void cannotBookPassengerFull(){
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger3);
        assertEquals(3,passengerList.size());
    }

}
