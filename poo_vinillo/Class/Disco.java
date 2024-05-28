package Class;

import java.time.LocalDate;


public abstract class  Disco{
  protected String discTitle;
  protected String discArtist;
  protected String discCategory;
  protected int discDuration;
  protected LocalDate discTimeRegistered;

  public Disco(String title, String artist, String category, int minuts, LocalDate registered){
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
  


}