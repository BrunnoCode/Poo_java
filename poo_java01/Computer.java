public class Computer{
  private String name;
  private String brand;
  private int ram;
  private int mem; 
  private float price;

  public Computer(String name, String brand, int ram, int mem, float price){
    this.name = name;
    this.brand = brand;
    this.ram = ram;
    this.mem = mem;
    this.price = price;
    System.out.println("Computer completed!");
  }
  public Computer(){};

  public void setName(String name){
    this.name = name;
  }
  public void getName(){
    System.out.println(this.name);
  }
  public void setPrice(float price){
    this.price = price;
  }
  public float getPrice(){
    return this.price;
  }
}
