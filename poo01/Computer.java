public class Computer{
  private String model;
  private String brand;
  private int ram;
  private int mem; 
  private float price;

  public Computer(String model, String brand, int ram, int mem, float price){
    this.brand = brand;
    this.model = model;
    this.ram = ram;
    this.mem = mem;
    this.price = price;
  }
  public Computer(){};
// MARCA ORDENADOR
  public void setBrand(String brand){
    this.brand = brand;
  }

  public String getBrand(){
   return this.brand;
  }
// MODELO ORDENADOR
  public void setModel(String model){
    this.model = model;
  }
  public String getModel(){
    return this.model;
  }
  // PRECIO ORDENADOR
  public void setPrice(float price){
    this.price = price;
  }
  public float getPrice(){
    return this.price;
  }
  // MEMORIA Y RAM DEL ORDENADOR 
  public int getMem(){
    return this.mem;
  }
  public void setMem(int mem){
    this.mem = mem;
  }
  public int getRam(){
    return this.ram;
  }
  public void setRam(int ram){
    this.ram = ram;
  }


}
