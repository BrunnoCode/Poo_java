package Utils;

import Class.Toy;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods{

  //UTILS METHODS
  public static float sizeCalculate(float sizeX, float sizeY, float sizeZ){
      return (sizeX + sizeY + sizeZ);
  }

  public static void selectMessage(){
    System.out.println("1-Crear lista de Juguetes.\n2-Elegir Juguete a ser enviado.\n3-Listar todos los juguetes añadidos.\n4-Editar o eliminar juguetes\n5-salir");
  }

  public static void cleanScreen(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
  }
  //USR METHODS
  public static void usrSelection(ArrayList<Toy> toys, int option, Scanner scan){
    switch (option) {
      case 1:
        cleanScreen();
        System.out.println("Crear lista selecionado:");
        Toy toy = new Toy();
        System.out.print("Juguete: ");
        toy.setToyName(scan.nextLine());
        System.out.print("Tamaño de largo, (ejemplo: 25.15) -> ");
        toy.setToyDimensionX(Float.parseFloat(scan.nextLine()));
        System.out.print("Tamaño Altura, (ejemplo: 25.15) -> ");
        toy.setToyDimensionY(Float.parseFloat(scan.nextLine()));
        System.out.print("Tamaño Ancho, (ejemplo: 25.15) -> ");
        toy.setToyDimensionZ(Float.parseFloat(scan.nextLine()));
        System.out.print("Precio, (ejemplo: 40.99) -> ");
        toy.setToyPrice(Double.parseDouble(scan.nextLine()));
        cleanScreen();
        toys.add(toy);
        System.out.println("Juguete añadido!!!");
        break;
    
      default:
        break;
    }
  }
}