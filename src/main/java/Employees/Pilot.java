package Employees;

public class Pilot {

    private CrewRank crewRank;
    String name;
    String licenceNo;

    public Pilot(CrewRank crewRank, String name,String licenceNo){
        this.crewRank = crewRank;
        this.name = name;
        this.licenceNo = licenceNo;

    }

    public CrewRank getRank() {
        return crewRank;
    }

    public String getName() {
        return name;
    }

    public String getLicence() {
        return licenceNo;
    }

    public String canFly() {
        return "Yeah I'am a Pilot";
    }
}
