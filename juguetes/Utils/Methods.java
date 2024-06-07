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
    System.out.println("1-Crear lista de Juguetes o seguir añadiendo.\n2-Elegir Juguete a ser enviado.\n3-Listar todos los juguetes añadidos.\n4-Editar o eliminar juguetes\n5-salir");
  }

  public static void cleanScreen(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void listToys(ArrayList<Toy> toys){
    int x = 0;
    for (Toy index : toys){
      System.out.println("\n"+x+"-> "+index.toString());
      x++;
    }
  }

  public static void editToy(int index, ArrayList<Toy> toys){
    cleanScreen();
    System.out.println("Juguete Elegido:\n");
    toys.get(index).toString();
    System.out.println("\nQué parte quieres modificar o eliminar?");
  }
  //USR METHODS
  public static void usrSelection(ArrayList<Toy> toys, int option, Scanner scan){
    String usrScan;
    switch (option) {
      case 1:
        cleanScreen();
        System.out.println("1: Crear lista selecionado:");
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
        System.out.println("\nJuguete añadido!!!\n");
        break;
      case 2:
        cleanScreen();
        System.out.println("2: Selecionar Juguete a ser enviado:");
        listToys(toys);
        int index = Integer.parseInt(scan.nextLine());
        if (index > toys.size() || index < 0){
          cleanScreen();
          System.out.println("XXXXXXX Error, el valor no coincide! XXXXXXX");
        } else {
          cleanScreen();
          System.out.println("Juguete a ser enviado: \n\n"+toys.get(index).toString()+"\n");
          System.out.print("Precio de envío que quieres poner: ");
          float price = Float.parseFloat(scan.nextLine());
          cleanScreen();
          float dimension = Methods.sizeCalculate(toys.get(index).getToyDimensionX(), toys.get(index).getToyDimensionY(), toys.get(index).getToyDimensionZ());
          System.out.println("El precio para enviar este articulo es: "+ (dimension/price)+"€");
          System.out.println("Enviar Juguete ? si/no?");
          usrScan = scan.nextLine();
          while(!usrScan.equalsIgnoreCase("si") && !usrScan.equalsIgnoreCase("no")){
            System.out.println("La respuesta no coincide, tecle si o no.");
            usrScan = scan.nextLine();
          }
          if (usrScan.equalsIgnoreCase("si")){
            cleanScreen();
            System.out.println("Juguete enviado con exito! Ya no se encuentra en la lista.\n\n");
            toys.remove(index);
          } else {
            cleanScreen();
            System.out.println("Juguete no enviado!");
          }
        }
        break;
      case 3:
      if (toys.size() > 0){ 
          cleanScreen();
          System.out.println("Listado de Todos los Juguetes:\n\n");
          listToys(toys);
          System.out.println("\n\nPresione Enter!");
          scan.nextLine();
        } else {
          cleanScreen();
          System.out.println("Ups! No hay nada para listar :( ");
        }
        System.out.println("\nXOXOXOXOXOXOXOXOXOXOXOOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXO\n");
        break;
      case 4:
        cleanScreen();
        if (toys.size() > 0){
            System.out.println("-*-*-*-*-* Elija qué juguete quieres Modificar o Eliminar? -*-*-*-*-*\n");
            listToys(toys);
            int intScan = Integer.parseInt(scan.nextLine());
            if (intScan >= 0 && !(intScan > toys.size())){
              editToy(intScan, toys);
            } else {
              System.out.println("XXXXX Este Juguete no existe dentro de la Lista! XXXXX");
            }
          } else {
            System.out.println("\nNo hay juguetes añadidos!\n");
        }

        break;
      case 5:
        cleanScreen();
        System.out.println("\u001B[34m" + "****************************************************" + "\u001B[0m");
        System.out.println("\u001B[34m" + "*                                                  *" + "\u001B[0m");
        System.out.println("\u001B[34m" + "*          \u001B[33mGracias por visitar nuestra Tienda,\u001B[0m        *" + "\u001B[34m" + " *" + "\u001B[0m");
        System.out.println("\u001B[34m" + "*                     \u001B[33mhasta pronto!\u001B[0m                *" + "\u001B[34m" + " *" + "\u001B[0m");
        System.out.println("\u001B[34m" + "*                                                  *" + "\u001B[0m");
        System.out.println("\u001B[34m" + "****************************************************" + "\u001B[0m");
        break;
      default:
        System.out.println("Opción no válida!");
        break;
    }
  }
}