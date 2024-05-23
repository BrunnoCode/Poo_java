package Utils;

import java.util.ArrayList;
import java.util.Scanner;

import Class.Bike;

public class Methods{
  public static void putLine(){
    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
  }

  public static void buildBikeList(ArrayList<Bike> bike){
    Scanner scan = new Scanner(System.in);
    bici = new Bike();
    bike.add(bici);
    System.out.print("Introduzca la marca de la bici: ");
    scan.close();
  }
}