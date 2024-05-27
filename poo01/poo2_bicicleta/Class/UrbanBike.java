package Class;

public class UrbanBike extends Bike{
  private boolean suspension;


  public UrbanBike(){}

  public UrbanBike(String brand, String model, int speed, boolean suspension){
    super(brand, model, speed);
    this.suspension = suspension;
  }

  public boolean getSuspension(){
    return this.suspension;
  }

  public void setSuspension(boolean suspension){
    this.suspension = suspension;
  }

  public String toString(){
    String res;
    if(suspension)
      res = "si";
    else
      res = "no";
    return super.toString()+"\nSuspención: "+res;
  }
}