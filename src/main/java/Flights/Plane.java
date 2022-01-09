package Flights;

public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public PlaneType getType() {
        return planeType;
    }

    public int getWeight() {
        return this.planeType.getWeight();
    }

    public int getCapacity() {
        return this.planeType.getCapacity();
    }
}
