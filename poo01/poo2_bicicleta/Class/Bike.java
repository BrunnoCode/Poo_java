package Class;

public abstract class Bike{
  protected String brand;
  protected String model;
  protected int speed;

  protected  Bike(){};

  protected Bike(String brand, String model, int speed){
    this.brand = brand;
    this.model = model;
    this.speed = speed;
  }

  // GETTERS
  public String getBrand(){
    return this.brand;
  }
  public String getModel(){
    return this.model;
  }
  public int getSpeed(){
    return this.speed;
  }
  // SETTERS
  public void setBrand(String brand){
    this.brand = brand;
  }
  public void setModel(String model){
    this.model = model;
  }
  public void setSpeed(int speed){
    this.speed = speed;
  }
}
