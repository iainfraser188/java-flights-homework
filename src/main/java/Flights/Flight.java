package Flights;
import Employees.CabinCrewMember;
import Employees.Pilot;

import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> CrewMembers;
    private ArrayList<Passenger> Passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot,
                  ArrayList<CabinCrewMember> crewMembers,
                  ArrayList<Passenger> passengers,
                  Plane plane,
                  String flightNo,
                  String destination,
                  String departureAirport,
                  String departureTime){
        this.pilot = pilot;
        this.CrewMembers = crewMembers;
        this.Passengers = passengers;
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }


    public Pilot getPilot() {
        return this.pilot;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNo() {
        return this.flightNo;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getTime() {
        return this.departureTime;
    }

    public int availableSeats() {
        return this.plane.getCapacity() - this.Passengers.size();
    }

    public <passenger> void bookPassenger(Passenger passenger) {
        if (this.plane.getCapacity() > this.Passengers.size()){
            this.Passengers.add(passenger);
        }
    }
}
