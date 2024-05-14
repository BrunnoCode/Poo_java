import java.util.ArrayList;
import java.util.Scanner;

import Class.Partido;
import Utils.Methods;

public class Principal{
  public static void main(String[] args){
    System.out.println("Primero apresentaremos nuestros metodos:");
    System.out.println("Metodo printAlpha");
    Methods.printAlpha();
    Methods.jumpNline();
    System.out.println("Ahora un metodo que transforma un int pasado como argumento a una letra!");
    Scanner scan = new Scanner(System.in);
    System.out.print("Insira un numero de 33 hasta 126: ");
    while (!scan.hasNextInt()){
      System.out.println("Error! hay que ser un numero dentro del rango mencionado arriba!");
      scan.nextLine();
    }
    int usr = scan.nextInt();
    if (usr < 127 && usr > 32)
      Methods.printAscii(usr);
    else
      System.out.println("Numero fuera del rango mencionado, fim de programa!");
    scan.close();
    System.out.println("");
    System.out.println("         Elecciones de España         ");
    Methods.jumpNline();
    System.out.println("Enter para continuar.");
    scan.next();
    System.out.println("Debes crear al menos 5 partidos y poner sus porcentajes de votos.");
    System.out.println("Lista de comandos:\nMostrar Lista de comandos: lista\nCrear partido: crear\nCambiar nombre o porcentaje de partido: cambiar\nSalir: salir o cancelar");
    ArrayList<Partido> politca = new ArrayList<>();
    String user = scan.nextLine();
    int i = 0;
    do {
      switch (user) {
        case "lista":
          Methods.cleanScreen();
          Methods.list(politca);
          break;
        case "crear":
          Methods.create(politca, scan, i);
          i++;
          Methods.cleanScreen();
          break;
        case "cambiar":
          Methods.change(scan, politca);
          Methods.cleanScreen();
          break;
        default:
          System.out.println("Error: debes escribir uno de los comandos mencionados!");
          break;
      }
      user = scan.nextLine();

    } while (!user.equalsIgnoreCase("salir") || !user.equalsIgnoreCase("cancelar"));
  }
}