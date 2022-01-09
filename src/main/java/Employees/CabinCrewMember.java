package Employees;

public class CabinCrewMember {

    private CrewRank crewRank;
    String name;


    public CabinCrewMember(CrewRank crewRank, String name){
        this.crewRank = crewRank;
        this.name = name;


    }

    public static String getMessage() {
        return "Roooarrgh ur roo";
    }

    public CrewRank getRank() {
        return crewRank;
    }

    public String getName() {
        return name;
    }
}
