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
    jumpNline();
  }

  // Salto de linea \n *4
  public static void jumpNline(){
    System.out.println("\n*----------------------------------*\n");
  }
  // Lista los partidos
  public static void list(ArrayList<Partido> partido){
    for (int i = 0; i < partido.size(); i++){
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
        edit(partido, scan);
        break;
      default:
        System.out.println("Error: Opción no valida, Edición fallida!");
        break;
    }
  }
  //Metodo Deletar Partido
  public static void delete(ArrayList<Partido> partido, Scanner scan){
    System.out.println("Qué partido quieres eliminar ?");
    list(partido);
    int usr = scan.nextInt();
    usr--;
    if (usr >= 0 && usr < partido.size()){
      System.out.println("Partido "+partido.get(usr).getNamePartido()+" Eliminado!");
      partido.remove(usr);
    } else {
      System.out.println("Error: El partido no existe!");
    }
  }
  //Metodo Editar Partido
  public static void edit(ArrayList<Partido> partido, Scanner scan){
    clearScreen();
    System.out.println("Qué Partido quieres Modificar?");
    list(partido);
    int index = scan.nextInt();
    index--;
    clearScreen();
    scan.nextLine();
    System.out.println("Modificar Nombre del Partido "+partido.get(index).getNamePartido()+" tecle 1\nModificar porcentaje tecle 2");
    int usr = Integer.parseInt(scan.nextLine());
    switch (usr) {
      case 1:
        System.out.print("Elija un nuevo nombre: ");
        scan.nextLine();
        String before = partido.get(index).getNamePartido();
        String newName = scan.nextLine();
        partido.get(index).setNamePartido(newName);
        System.out.format("Partido %s cambiado a %s\n", before, newName);
        jumpNline();
        break;
      case 2:
        System.out.println("Cambiar porcentaje:");
        System.out.println("Porcentaje anterior "+partido.get(index).getPartidoPorcent()+"%");
        System.out.print("Indique un nuevo valor: ");
        int newValue = Integer.parseInt(scan.nextLine());
        partido.get(index).setPartidoPorcent(newValue);
        System.out.println("Nuevo porcentaje del partido "+partido.get(index).getNamePartido()+" és: "+newValue+"%");
        break;
      default:
        System.out.println("Numero fuera de las opciones!");
        break;
    }
  }

  public static void clearScreen() {
    // Codigo ANSI para limpiar terminal
    System.out.print("\033[H\033[2J");
    System.out.flush();
}
   
}
