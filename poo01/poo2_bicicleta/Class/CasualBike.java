package Class;

public class CasualBike extends Bike{
  private boolean claxon;

  public CasualBike(){}

 public CasualBike(String brand, String model, int speed, boolean claxon){
  super(brand, model, speed);
  this.claxon = claxon;
 }

 public void setClaxon(boolean claxon){
  this.claxon = claxon;
 }

 public boolean getClaxon(){
  return claxon;
 }

 @Override

 public String toString(){
  String res = "";
  if (claxon)
    res = "si";
  else 
    res = "no";
  return super.toString()+"\nClaxon: "+res;
 }
}