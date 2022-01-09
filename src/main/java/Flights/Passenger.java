package Flights;

public class Passenger {
        String name;
        int noOfBags;

        public Passenger(String name, int noOfBags){
            this.name = name;
            this.noOfBags= noOfBags;
        }

    public String getName() {
            return name;
    }

    public int getNoOfBags() {
            return noOfBags;
    }
}
