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
        System.out.println("Cúal de los discos quieres modificar o remover? ");
        int index = listElement(discos);
        editElement(discos, index, scan);
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

  public static int listElement(ArrayList<Disco> discos){
    int index = 0;
    for (int i = 0; i < discos.size(); i++){
      System.out.println(i+"- "+discos.get(i).getTitle());
      index++;
    }
    return index;
  }

  public static void editElement(ArrayList<Disco> disco, int element, Scanner userOption){
    cleanScreen();
    System.out.println("1-Modificar\n2-Deletar");
    if (Integer.parseInt(userOption.nextLine()) == 2){
      String beforeElement = disco.get(element).getTitle();
      disco.remove(element);
      putLine();
      System.out.println("Disco "+beforeElement+" Eliminado!");
      putLine();
    } else if(Integer.parseInt(userOption.nextLine()) == 1){
        listDiscAttribute(disco, element, userOption);
    } else
        cleanScreen();
        putLine();
        System.out.println("Opción no válida!");
        putLine();
  }

  public static void listDiscAttribute(ArrayList<Disco> disco, int element, Scanner scan){
    cleanScreen();
    putLine();
    System.out.println("Qué parte quieres modificar:");
    System.out.println("1-Titulo\n2-Artista\n3-Categoria\n4-Duracion\n5-Cancelar acción");
    int attribute = Integer.parseInt(scan.nextLine());
    String auxBefore;
    switch (attribute) {
      case 1:
        cleanScreen();
        auxBefore = disco.get(element).getTitle();
        System.out.print("Nuevo titulo: ");
        disco.get(element).setTitle(scan.nextLine());
        putLine();
        System.out.println("Titulo "+auxBefore+" cambiado a "+disco.get(element).getTitle()+" correctamente!");
        break;
      case 2:
        cleanScreen();
        auxBefore = disco.get(element).getArtist();
        System.out.print("Nuevo Artista: ");
        disco.get(element).setArtist(scan.nextLine());
        putLine();
        System.out.println("Artista "+auxBefore+" cambiado a "+disco.get(element).getArtist()+" correctamente!");
        break;
      case 3:
        cleanScreen();
        auxBefore = disco.get(element).getCategory();
        System.out.print("Nueva Categoria: ");
        disco.get(element).setCategory(scan.nextLine());
        putLine();
        System.out.println("Categoria "+auxBefore+" cambiado a "+disco.get(element).getCategory()+" correctamente!");
        break;
      case 4:
        cleanScreen();
        float before = disco.get(element).getDuration();
        System.out.print("Nueva Duración ej: '00.00': ");
        disco.get(element).setDuration(Float.parseFloat(scan.nextLine()));
        putLine();
        System.out.println("Tiempo de duración "+before+" cambiado a "+disco.get(element).getDuration()+" correctamente!");
        break;
      default:
        if (attribute == 5){
          putLine();
          System.out.println("Acción Cancelada!");
          putLine();
        } else{
          System.out.println("Lo siento, no existe esta opción!");
          listDiscAttribute(disco, element, scan);
        }
        break;
    }
  }
}