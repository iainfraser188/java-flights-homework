package Flights;

public enum PlaneType {
    BOEING747(3000,524),
    AIRBUS(5000,853),
    YT1300F(100000,3);

    private final int weight;
    private final int capacity;

    PlaneType(int weight, int capacity){
        this.weight = weight;
        this.capacity = capacity;
    }


    public int getWeight() {
        return this.weight;
    }
    public int getCapacity() {
        return this.capacity;
    }
}
