package Utils;

import java.util.ArrayList;
import java.util.Scanner;

import Class.Partido;

public class Methods{
  // Printar Alfabeto minusculas y mayusculas
  public static void printAlpha(){
    int i = 65;
    while (i <= 122){
      if (i > 90 && i < 97)
        i++;
      else
        System.out.format("%c", i++);
      if (i == 91)
        System.out.format(" ");
    }
    System.out.println();
  }

  // Printar char segun numero dado por el usuario
  public static void printAscii(int c){
    System.out.format("%c\n", c);
  }

  // Salto de linea \n *4
  public static void jumpNline(){
    System.out.println("\n\n----------------------------------\n");
  }
  // Lista los partidos
  public static void list(ArrayList<Partido> politica){
    for (Partido x : politica){
      x.getNamePartido();
      graficPorcent(x.getPartidoPorcent());
    }
  }
  // Grafico de porcentaje
  public static void graficPorcent(int pct){
    for (int i = 0; i < pct; i++){
      System.out.print("#");
    }
  }
  // Creador de partidos
  public static void create(ArrayList<Partido> politica, Scanner scan, int i){
    politica.add(new Partido());
    System.out.print("Partido: ");
    politica.get(i).setNamePartido(scan.nextLine());
    System.out.print("Porcentaje de votos: ");
    politica.get(i).setPartidoPorcent(scan.nextInt());
    System.out.println("Partido creado!");
  }
  // Cambiar datos del partido
  public static void change(Scanner scan, ArrayList<Partido> politica){
    System.out.print("Qué te gustaria modificar, porcentaje/partido? ");
    String user = scan.nextLine();
    switch (user) {
      case "partido":
        System.out.println("Cúal de estos partidos:");
        for (Partido y : politica){
          y.getNamePartido();
        }
        user = scan.nextLine();
        int index = politica.indexOf(user);
        System.out.println("Elija un nuevo Partido:");
        politica.get(index).setNamePartido(scan.nextLine());
        break;
    
      default:
        break;
    }
    
  }
  // Limpiador de pantalla
  public static void cleanScreen(){
    System.out.println("\n\n\n\n\n\n\n\n");
  }
   
}