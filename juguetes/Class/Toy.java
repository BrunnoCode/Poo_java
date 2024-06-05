package Class;

public class Toy{ 
  private String toyName;
  private float toyDimension;
  private double toyPrice;

  public Toy(){
  }
  public Toy(String toyName, float toyDimension, double toyPrice){
    this.toyName = toyName;
    this.toyDimension = toyDimension;
    this.toyPrice = toyPrice;
  }
  //GETTERS
  public String getToyName(){
    return toyName;
  }
  public float getToyDimension(){
    return toyDimension;
  }
  public double getToyPrice(){
    return toyPrice;
  }
  //SETTERS
  public void setToyName(String toyName){
    this.toyName = toyName;
  }
  public void setToyDimension(float toyDimension){
    this.toyDimension = toyDimension;
  }
  public void setToyPrice(double toyPrice){
    this.toyPrice = toyPrice;
  }

  //TOY DESCRIPTION

  @Override

  public String toString(){
    return
          "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n"+
          "Juguete: "+getToyName()+"\n"+
          "Tamaño: "+getToyDimension()+"\n"+
          "Precio: "+getToyPrice()+"€\n"+
          "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n";
  }
}