public class Plane {

    private int capacity;
    private int totalWeight;

    private PlaneType planeType;

  public Plane(PlaneType planeType){
      this.planeType = planeType;
      planeType.getCapacity();
      planeType.getTotalWeight();
  }

    public int getCapacity() {
      return planeType.getCapacity();
    }

    public int getTotalWeight(){
      return planeType.getTotalWeight();
    }
}
