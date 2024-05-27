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
    scan.nextLine();
    String res;
    switch(usr){
      case 1:
        CasualBike bikeCasual = new CasualBike();
        putLine();
        System.out.println("Casual Bike, introduzca las características:");
        System.out.print("Marca: ");
        bikeCasual.setBrand(scan.nextLine());
        System.out.print("Modelo: ");
        bikeCasual.setModel(scan.nextLine());
        System.out.print("Velocidad: ");
        bikeCasual.setSpeed(Integer.parseInt(scan.nextLine()));
        System.out.print("Tiene Claxon? si/no: ");
        res = scan.nextLine();
        if (res.equalsIgnoreCase("si"))
          bikeCasual.setClaxon(true);
        else if (res.equalsIgnoreCase("no"))
          bikeCasual.setClaxon(false);
        else
          System.out.println("respuesta no valida!");
        bike.add(bikeCasual);
        break;
      case 2:
      MountainBike MountainBike = new MountainBike();
      putLine();
      System.out.println("Mountain Bike, introduzca las características:");
      System.out.print("Marca: ");
      MountainBike.setBrand(scan.nextLine());
      System.out.print("Modelo: ");
      MountainBike.setModel(scan.nextLine());
      System.out.print("Velocidad: ");
      MountainBike.setSpeed(Integer.parseInt(scan.nextLine()));
      System.out.print("Tiene Marchas? si/no: ");
      res = scan.nextLine();
      if (res.equalsIgnoreCase("si"))
        MountainBike.setGears(true);
      else if (res.equalsIgnoreCase("no"))
        MountainBike.setGears(false);
      else
        System.out.println("respuesta no valida!");
      bike.add(MountainBike);
        break;
      case 3:
      UrbanBike bikeUrban = new UrbanBike();
      putLine();
      System.out.println("Casual Bike, introduzca las características:");
      System.out.print("Marca: ");
      bikeUrban.setBrand(scan.nextLine());
      System.out.print("Modelo: ");
      bikeUrban.setModel(scan.nextLine());
      System.out.print("Velocidad: ");
      bikeUrban.setSpeed(Integer.parseInt(scan.nextLine()));
      System.out.print("Tiene Suspención? si/no: ");
      res = scan.nextLine();
      if (res.equalsIgnoreCase("si"))
        bikeUrban.setSuspension(false);
      else if (res.equalsIgnoreCase("no"))
        bikeUrban.setSuspension(false);
      else
        System.out.println("respuesta no valida!");
      bike.add(bikeUrban);
        break;
      default:
        System.out.println("Opción no válida!");
        break;
    }
    putLine();
    System.out.println("Bike añadida!");
    scan.close();
  }
  public static void displayBikeList(ArrayList<Bike> bikes){
    for (Bike bike : bikes){
      bike.toString();
    }
  }
}