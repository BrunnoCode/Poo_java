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
    System.out.println("Computer completed!");
  }
  public Computer(){};
// MARCA ORDENADOR
  public void setBrand(String brand){
    this.brand = brand;
  }

  public void getBrand(){
   System.out.println(this.brand);
  }
// MODELO ORDENADOR
  public void setModel(String model){
    this.model = model;
  }
  public void getModel(){
    System.out.println(this.model);
  }
  // PRECIO ORDENADOR
  public void setPrice(float price){
    this.price = price;
  }
  public float getPrice(){
    return this.price;
  }
  // MEMORIA Y RAM DEL ORDENADOR 
  public void getMem(){
    System.out.println(this.mem);
  }
  public void setMem(int mem){
    this.mem = mem;
  }
  public void getRam(){
    System.out.println(this.ram);
  }
  public void setRam(int ram){
    this.ram = ram;
  }

}
