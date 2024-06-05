package Class;

import Utils.Methods;

public class Toy{ 
  private String toyName;
  private float toyDimensionX;
  private float toyDimensionY;
  private float toyDimensionZ;
  private double toyPrice;
  
  public Toy(){
  }
  public Toy(String toyName, float toyDimensionX, float toyDimensionY, float toyDimensionZ, double toyPrice){
    this.toyName = toyName;
    this.toyDimensionX = toyDimensionX;
    this.toyDimensionY = toyDimensionY;
    this.toyDimensionZ = toyDimensionZ;
    this.toyPrice = toyPrice;
  }
  //GETTERS
  public String getToyName(){
    return toyName;
  }
  public float getToyDimensionX(){
    return toyDimensionX;
  }
  public float getToyDimensionY() {
    return toyDimensionY;
  }
  public float getToyDimensionZ() {
    return toyDimensionZ;
  }
  public double getToyPrice(){
    return toyPrice;
  }
  //SETTERS
  public void setToyName(String toyName){
    this.toyName = toyName;
  }
  public void setToyDimensionX(float toyDimensionX){
    this.toyDimensionX = toyDimensionX;
  }
  public void setToyDimensionY(float toyDimensionY){
    this.toyDimensionY = toyDimensionY;
  }
  public void setToyDimensionZ(float toyDimensionZ) {
    this.toyDimensionZ = toyDimensionZ;
  }
  public void setToyPrice(double toyPrice){
    this.toyPrice = toyPrice;
  }

  //TOY DESCRIPTION

  @Override

  public String toString(){
    return
          "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"+
          "Juguete: "+getToyName()+"\n"+
          "Tamaño de largo: "+getToyDimensionX()+"cm alto: "+getToyDimensionY()+"cm ancho: "+getToyDimensionZ()+"cm\n"+
          "Volumen Total: "+Methods.sizeCalculate(getToyDimensionX(), getToyDimensionY(), getToyDimensionZ())+
          "Precio: "+getToyPrice()+"€\n"+
          "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n";
  }
}