package Utils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import Class.Disco;

public class Methods{

  public static void timer(){
    System.out.println("Listando Discos creados...");
    try {
      for (int i=0;i<10;i++){
          Thread.sleep(200); 
          System.out.print(".");
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.print(" Hecho!\n");
}

  public static void putLine(){
    System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
  }

  public static void cleanScreen(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  //Manipulation user options
  public static void userAction(int user, ArrayList<Disco> discos, Scanner scan){
    switch (user) {
      case 1:
        cleanScreen();
        System.out.println("Ok, 1-Crear disco...");
        Disco newDisc = new Disco();
        System.out.print("Titulo del disco: ");
        newDisc.setTitle(scan.nextLine());
        System.out.print("Artista: ");
        newDisc.setArtist(scan.nextLine());
        System.out.print("Categoria del Disco: ");
        newDisc.setCategory(scan.nextLine());
        System.out.print("Duración del Disco: ");
        newDisc.setDuration(Float.parseFloat(scan.nextLine()));
        System.out.println("Disco creado correctamente!");
        newDisc.setDate(LocalDateTime.now().toString().substring(0, 10));
        discos.add(newDisc);
        putLine();
        break;
      case 2:
        cleanScreen();
        System.out.println("2 seleccionado!");
        timer();
        for (Disco disc : discos){
          System.out.println(disc.toString());
          putLine();
        }
        break;
      case 3:
        cleanScreen();
        System.out.println("3 selecionado!");
        System.out.println("Cúal de los discos quieres modificar? ");
        for (int i = 0; i < discos.size(); i++){
          // Terminar esta parte 
        }
        break;
    
      default:
        if (user != 0){
          cleanScreen();
          System.out.println("Ops! esta opción no existe, pruebe una de las opciones.");
          putLine();
        } else
          System.out.println("Programa finalizado, hasta pronto!");
        break;
    }
  }
}