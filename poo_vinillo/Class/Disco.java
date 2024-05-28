package Class;

public class  Disco{
  private String discTitle;
  private String discArtist;
  private String discCategory;
  private float discDuration;
  private String discTimeRegistered;

  public Disco(){}

  public Disco(String title, String artist, String category, float minuts, String registered){
    this.discTitle = title;
    this.discArtist = artist;
    this.discCategory = category;
    this.discDuration = minuts;
    this.discTimeRegistered = registered;
  }

  //Getters
  public String getTitle(){
    return discTitle;
  }
  public String getArtist(){
    return discArtist;
  }
  public String getCategory(){
    return discCategory;
  }
  public float getDuration(){
    return discDuration;
  }
  public String getDate(){
    return discTimeRegistered;
  }

  //Setters
  public void setTitle(String title){
    this.discTitle = title;
  }
  public void setArtist(String artist){
    this.discArtist = artist;
  }
  public void setCategory(String category){
    this.discCategory = category;
  }
  public void setDuration(float time){
    this.discDuration = time;
  }
  public void setDate(String register){
    this.discTimeRegistered = register;
  }

  public String toString(){
    return "Titulo del Disco: "+getTitle()+"\n"+
           "Artista: "+getArtist()+"\n"+
           "Categoria: "+getCategory()+"\n"+
           "Duracion: "+getDuration()+"min\n"+
           "Fecha de Registro: "+getDate()+"\n";
  }

}