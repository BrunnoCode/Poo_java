package Class;

public class Partido{
  private String name;
  private int porcentage;

  public Partido(){};

  public Partido(String name, int porcentage){
    this.name = name;
    this.porcentage = porcentage;
  }

  public void setNamePartido(String name){
    this.name = name;
  }

  public void setPartidoPorcent(int porcentage){
    this.porcentage = porcentage;
  }
  
  public String getNamePartido(){
    return this.name;
  }

  public int getPartidoPorcent(){
    return this.porcentage;
  }

  public String toString(){
    return
      "Partido: "+getNamePartido()+" "+getPartidoPorcent()+"%";
  }
}