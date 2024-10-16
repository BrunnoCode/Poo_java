package com.mycompany.ejercicio1.Utils;


public class Methods {

  // Metodo que trata error de entrada de usuario
  public static void managerUserInput(int input){
    System.out.println(input);
    
  }

  // Metodo limpiar pantalla
  public static void cleanScreen(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
// Metodo Timer causa un delay en pantalla
public static void timer(){
    System.out.print("Cargando ");
    for (int i = 30; i > 0; i--){
      System.out.print("/");
      try {
        Thread.sleep(65);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }
   
}
// Metodo creador de linea en pantalla
public static void putLine(){
    System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
  }
}
