package Class;

public class MountainBike extends Bike{
  private boolean gears;

  public MountainBike(){}

  public MountainBike(String brand, String model, int speed, boolean gears){
    super(brand, model, speed);
  }

  public boolean getGears(){
    return this.gears;
  }

  public void setGears(boolean gears){
    this.gears = gears;
  }

  public String toString(){
    String res = getGears() ? "si" : "no";
    return super.toString()+"\nMarchas: "+res;
  }
}