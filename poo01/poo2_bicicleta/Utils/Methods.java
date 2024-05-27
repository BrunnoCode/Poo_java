package Utils;

import java.util.ArrayList;
import java.util.Scanner;

import Class.Bike;
import Class.CasualBike;
import Class.MountainBike;
import Class.UrbanBike;

public class Methods{
  public static void putLine(){
    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
  }

  public static void buildBikeList(ArrayList<Bike> bike){
    Scanner scan = new Scanner(System.in);
    System.out.println("Qué clase de bike quieres fichar? tecle:\n1: Casual\n2: Montaña\n3: Urbana");
    int usr = scan.nextInt();
    int index = 0;

    switch(usr){
      case 1:
      bike.add(index, new CasualBike());
      System.out.print("Marca: ");
      bike.get(index).setBrand(scan.nextLine());
      System.out.print("Modelo: ");
      bike.get(index).setModel(scan.nextLine());
      

    }



    bike.add(new MountainBike());
    bike.add(new UrbanBike());
    scan.close();
  }
}