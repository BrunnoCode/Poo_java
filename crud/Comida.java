public class Comida{
  private String foodName;
  private String origin;
  private float weight;
  private double price;

  public Comida(){}

  public Comida(String foodName, String origin, float weight, double price){
    this.foodName = foodName;
    this.origin = origin;
    this.weight = weight;
    this.price = price;
  }

  public String getFoodName() {
    return foodName;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String toString(){
    String peso = getWeight() >= 1.00 ? "kg" : "g";
    return
          "Alimento: "+getFoodName()+"\n"+
          "Origen: "+getOrigin()+"\n"+
          "Peso: "+getWeight()+peso+"\n"+
          "Precio: "+getPrice()+"€\n";
  }
}