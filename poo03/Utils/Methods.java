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
    System.out.println("\n*----------------------------------*\n");
  }
  // Lista los partidos
  public static void list(ArrayList<Partido> partido){
    for (int i = 0; i <= partido.size()-1; i++){
      System.out.format("%d-> %s %d%% ", i+1, partido.get(i).getNamePartido(), partido.get(i).getPartidoPorcent());
      graficPorcent(partido.get(i).getPartidoPorcent());
      System.out.println();
    }
  }
  // Grafico de porcentaje
  public static void graficPorcent(int pct){
    for (int i = 0; i < pct; i++){
      System.out.print("#");
    }
  }
  // Creador de partidos
  public static void create(ArrayList<Partido> partido, Scanner scan, int i){
    partido.add(i, new Partido());
    System.out.print("Partido: ");
    scan.nextLine();
    partido.get(i).setNamePartido(scan.nextLine());
    System.out.print("Porcentaje de votos: ");
    int usr = scan.nextInt(); 
    boolean err = false;
    do {
      if (usr > 100 || usr < 1){
       System.out.println("El porcentaje debe ser maior que 0 y menor que 100");
       usr = scan.nextInt();
      } else {
        err = true;
      }
    } while(!err);
    partido.get(i).setPartidoPorcent(usr);
    
    System.out.println("Partido creado!\n");
  }

  public static void change(ArrayList<Partido> partido, Scanner scan){
    clearScreen();
    System.out.println("Selecione qué quieres hacer:\n");
    System.out.println("Eliminar partido -> 1\nModificar Partido -> 2");
    int usr = scan.nextInt();

    switch (usr) {
      case 1:
        delete(partido, scan);
        break;
      case 2:
        //edit(partido, scan);
        break;
      default:
        System.out.println("Error: Opción no valida, Edición fallida!");
        break;
    }
  }

  public static void delete(ArrayList<Partido> partido, Scanner scan){
    System.out.println("Qué partido quieres eliminar ?");
    list(partido);
    int usr = scan.nextInt();
    if (usr >= 0 && usr <= partido.size()){
      partido.remove(usr-1);
      System.out.println("Partido "+partido.get(usr).getNamePartido()+" Eliminado!");
    } else {
      System.out.println("Error: El partido no existe!");
    }
  }

  public static void clearScreen() {
    // Codigo ANSI para limpiar terminal
    System.out.print("\033[H\033[2J");
    System.out.flush();
}
   
}