import Class.*;
import Utils.Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class BikeApp{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Bike> bikes = new ArrayList<>();
    int opt;
    System.out.println("\n********** Bike List **********\n");
    do{
      if (bikes.size() > 0)
        System.out.println("Crear otra presione 1, 2 para ver bikes creadas o 0 para salir");
      else
        System.out.println("Crear Lista de bikes presione 1, ver lista de bikes presione 2, salir presione 0");
      opt = scan.nextInt();
      switch (opt) {
        case 1:
          Methods.buildBikeList(bikes, scan);
          Methods.cleanScreen();
          break;
        case 2:
          if (bikes.size() > 0){
            Methods.cleanScreen();
            Methods.displayBikeList(bikes);
          } else{
            Methods.putLine();
            System.out.println("\nNo hay ninguna bike para listar, debes crear una lista antes!\n");
            Methods.putLine();
          }
          break;
        default:
          if (opt != 0)
            System.out.println("Opción inválida!");
          else
            System.out.println("Programa finalizado, hasta la próxima!");
          break;
      }

    }while(opt != 0);


    scan.close();
  }

}