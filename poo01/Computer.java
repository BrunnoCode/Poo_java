
public class Computer{
  private String brand;
  private String model;
  private int ram;
  private int mem; 
  private float price;
  private boolean stock; 

  public Computer(String model, String marca, int ram, int mem, float price, boolean stock){
    this.brand = marca;
    this.model = model;
    this.ram = ram;
    this.mem = mem;
    this.price = price;
    this.stock = stock;
  }
  public Computer(){};   // POLIMORFISMO
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
  // ESTOQUE
  public void setStock(boolean stock){
    this.stock = stock;
  }
  public boolean getStock(){
    return this.stock;
  }
  
  @Override
  public String toString(){

    String available = "";
    String gigas = "";
    char n = '\n';
    if (stock)
      available = "Disponible";
    else
      available = "No Disponible";

    if (mem >= 1000){
      gigas = "1TB";
    }
    else
      gigas = getMem()+"GB";

    return
      "Marca: " + getBrand().toUpperCase() + n +
      "Model: " + getModel().toUpperCase() + n + 
      "Ram: " + getRam() + "Gb" + n + 
      "Armazenamiento: " + gigas + n +
      "Precio: " + getPrice() + "€" + n +
      "Disponibilidad: " + available.toUpperCase() +
      n+"--------------------------"+n;
  }
}
