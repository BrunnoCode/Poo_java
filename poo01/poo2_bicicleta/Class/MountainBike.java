package Class;

public class MountainBike extends Bike{
  private int gears;

  public MountainBike(){}

  public MountainBike(String brand, String model, int speed, int gears){
    super(brand, model, speed);
  }

  public int getGears(){
    return this.gears;
  }

  public void setGears(int gears){
    this.gears = gears;
  }

  public String toString(){
    return super.toString()+"\nMarchas: "+getGears();
  }
}