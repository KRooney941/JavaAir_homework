public enum PlaneType {
    CESSNA172(3, 100),
    BOEING747(200, 500),
    AIRBUS(500, 600),
    JUMBOJET(700, 1000);



    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight(){
        return totalWeight;
    }


}

