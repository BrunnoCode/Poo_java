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
    int usr = -1;
    do {
        if (scan.hasNextInt()){
          usr = scan.nextInt();
          scan.nextLine();
          if (usr < 127 && usr > 32){
            System.out.print("Resultado: ");
            Methods.printAscii(usr);
          } else if(usr != 0) {
              System.out.println("Numero fuera del rango mencionado.");
          }
        }
        if (usr != 0){
          System.out.println("Otro numero o pulse 0 para salir.");
        }
      } while (usr != 0);
    // Elecciones de España ejercicio
    Methods.clearScreen();
    System.out.println("*---------------* ELECCIONES 2024 *---------------*");
    ArrayList<Partido> partido = new ArrayList<>();
    System.out.println("\nDebes crear al menos 5 partidos politicos y poner sus porcentajes de votos:\n");
    System.out.println("Todavía no existe ningun partido configurado, empieze teclando 1 para crear los partidos:");
    System.out.println("\n1* crear partido\n2* modificar partido o eliminar\n3* listar resultado\n4* salir");
    int index = -1;
    usr = scan.nextInt();
    int min = 5;
      do {
        switch (usr) {
          case 1:
            do {
                Methods.create(partido, scan, ++index);
                min--;
                if (min > 0)
                  System.out.println("debes crear "+min+" más!\n");
              } while (min > 0);
            break;
          case 2:
            if (partido.size() > 0){
              Methods.change(partido, scan);
            } else {
              System.out.println("No hay ningún partido creado para modificarlo!\n");
            }
            break;
          case 3:
            if(partido.size() > 0)
                Methods.list(partido);
            else
              System.out.println("Todavía no has creado ningún partido!\n");
            break;
          default:
            if (usr != 4)
              System.out.println("Opción no válida!\n");
            break;
        }
        if (usr != 4){
          System.out.println("Crear más partidos presione -> 1, modificar/eliminar -> 2, listar resultado -> 3, salir -> 4");
          usr = scan.nextInt();
        }
    } while (usr != 4);
    if (usr == 4)
      System.out.println("Gracias por colaborar, hasta la proxima!");
    scan.close();
  }
  
}