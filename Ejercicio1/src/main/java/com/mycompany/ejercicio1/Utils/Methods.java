package com.mycompany.ejercicio1.Utils;

import java.util.ArrayList;
import java.util.Scanner;

import com.mycompany.ejercicio1.Supermarket;
import com.mycompany.ejercicio1.User;

public class Methods {
  // TODOS LOS METODOS EN RELACION AL PROGRAMA

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
    Scanner userScan = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();
    System.out.print("Nombre: ");
    String name = userScan.nextLine();
    System.out.print("Email: ");
    String email = userScan.nextLine();
    System.out.print("Telefono: ");
    String tel = userScan.nextLine();
    System.out.print("Nombre de usuario: ");
    String user = userScan.nextLine();
    System.out.print("Una Contraseña: ");
    String password = userScan.nextLine();

    User newUser = new User(name, email, tel, user, password);
    users.add(newUser);
    timer("creando usuario: ");
    cleanScreen();
    System.out.println("Usuario creado!");
    putLine();
    userScan.close();

  }
  public static void handlerLogin(){
    System.out.println("");
  }
}
