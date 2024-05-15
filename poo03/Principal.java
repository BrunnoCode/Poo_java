import java.util.ArrayList;
import java.util.Scanner;

import Class.Partido;
import Utils.Methods;

public class Principal{
  public static void main(String[] args){
    System.out.println("\nPrimero apresentaremos nuestros metodos:");
    System.out.println("\nMetodo printAlpha()");
    Methods.printAlpha();
    System.out.println("\nAhora un metodo que transforma un int pasado como argumento a una letra!");
    Scanner scan = new Scanner(System.in);
    System.out.print("Insira un numero de 33 hasta 126: ");
    do {
        int usr = scan.nextInt();
        if (usr < 127 && usr > 32){
          System.out.print("Resultado: ");
          Methods.printAscii(usr);
        }
        else
          System.out.println("Numero fuera del rango mencionado.");
        System.out.println("Otro numero o escriba salir.");
      } while (scan.hasNextInt() || scan.nextLine().equalsIgnoreCase("salir"));
      scan.next();
    

    // Elecciones de España ejercicio
    Methods.clearScreen();
    System.out.println("*---------------* ELECCIONES 2024 *---------------*");
    ArrayList<Partido> partido = new ArrayList<>();
    System.out.println("\nDebes crear al menos 5 partidos politicos y poner sus porcentajes de votos:\n");
    System.out.println("Todavía no existe ningun partido configurado, elija que quieres hacer:");
    System.out.println("\n1* crear partido\n2* modificar partido o eliminar\n3* listar resultado\n4* salir");
    int index = -1;
    int usr = 0;

    usr = scan.nextInt();
    do {
        switch (usr) {
          case 1:
            Methods.create(partido, scan, ++index);
            break;
          case 2:
            Methods.change(partido, scan);
            break;
          default:
            System.out.println("Opción no válida!");
            break;
        }
      System.out.println("Crear otro partido presione -> 1, modificar/eliminar -> 2, listar resultado -> 3, salir -> 4");
      usr = scan.nextInt();
    } while (usr != 4);
    
    scan.close();
  }
  
}