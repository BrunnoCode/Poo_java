package com.mycompany.ejercicio1.Utils;

import java.util.ArrayList;
import java.util.Scanner;

import com.mycompany.ejercicio1.User;

public class Methods {
  private static Scanner inputUser = new Scanner(System.in);
  // TODOS LOS METODOS EN RELACION AL PROGRAMA

  public static void scannerClose(){
    inputUser.close();
  }

  public static void mainBuild(){
        System.out.println("Bien Venido al Supermercado\n1 (Login)\n2 (Crear cuenta)\n3 (salir)");
        int value = 0;
        boolean validInput = false;
        while(!validInput){
        if (inputUser.hasNextInt()){
            value = inputUser.nextInt();
            if (value >= 1 && value <= 3){
                managerUserInput(value);
                validInput = (value == 3);
            } else {
                putLine();
                System.out.println("Porfavor introduzca um numero entre 1 a 3!");
            }
        } else {
            putLine();
            System.out.println("Introduzca un valor numerico!\n1 (Login)\n2 (Crear cuenta)\n3 (salir)");
            inputUser.nextLine();
        }
    }
    inputUser.close();
  }

  // Metodo que trata entrada del usuario/ 1-login/2-crear cuenta/3-salir
  public static void managerUserInput(int input){
    timer("Cargando: ");
    cleanScreen();
    switch (input) {
      case 1:
        //handlerLogin();
        break;
      case 2:
         handlerNewAcount();
         break;
      case 3:
        timer("Hasta luego!");
        break;
      default:
        timer("Error$$ Cerrando programa: ");
        break;
    }
    
  }

  // Metodo limpiar pantalla
  public static void cleanScreen(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
// Metodo Timer causa un delay en pantalla
public static void timer(String message){
    System.out.print(message);
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

  // TODOS LOS METODOS RELACIONADOS CON EL USUARIO

  public static void handlerNewAcount(){
    System.out.println("*-*-*-*-*-*-*-*-*-*-*-* Creación de Usuario *-*-*-*-*-*-*-*-*-*-*-*");
    //Scanner inputUser = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();
    inputUser.nextLine();
    System.out.print("Nombre: ");
    String name = inputUser.nextLine();
    System.out.print("Email: ");
    String email = inputUser.nextLine();
    System.out.print("Telefono: ");
    String tel = inputUser.nextLine();
    System.out.print("Nombre de usuario: ");
    String user = inputUser.nextLine();
    System.out.print("Una Contraseña: ");
    String password = inputUser.nextLine();

    User newUser = new User(name, email, tel, user, password);
    users.add(newUser);
    timer("creando usuario: ");
    cleanScreen();
    putLine();
    System.out.println("Usuario creado!\n");
    mainBuild();
  }
  public static void handlerLogin(){
    
  }
}
