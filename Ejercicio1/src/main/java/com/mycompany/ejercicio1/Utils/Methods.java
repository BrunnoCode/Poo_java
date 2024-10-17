package com.mycompany.ejercicio1.Utils;

import java.util.ArrayList;
import java.util.Scanner;

import com.mycompany.ejercicio1.User;

public class Methods {
  private static ArrayList<User> userList = new ArrayList<>();
  private static Scanner inputUser = new Scanner(System.in);
  // TODOS LOS METODOS EN RELACION AL PROGRAMA

  // Metodo que llama la funcion principal
  public static void mainBuild(){
        System.out.println("Bien Venido al Supermercado Cuenta Admin\n1 (Login)\n2 (Crear cuenta)\n3 (salir)");
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
        handlerLogin();
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

  // Metodo Creador de un nuevo usuario
  public static void handlerNewAcount(){
    System.out.println("*-*-*-*-*-*-*-*-*-*-*-* Creación de Usuario *-*-*-*-*-*-*-*-*-*-*-*");
    //Scanner inputUser = new Scanner(System.in);
    //ArrayList<User> users = new ArrayList<>();
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
    userList.add(newUser);
    timer("creando usuario: ");
    cleanScreen();
    putLine();
    System.out.println("Usuario creado!\n");
    mainBuild();
  }
 
 // Metodo validador de cuenta de usuario
  public static void handlerLogin(){
    System.out.println("*-*-*-*-*-*-*-*-* Login *-*-*-*-*-*-*-*-*-");
    System.out.println("Presione Enter al rellenar cada campo!");
    inputUser.nextLine();
    boolean loginSuccess = false; 
    while (!loginSuccess){
      System.out.print("Usuario: ");
      String userName = inputUser.nextLine();
      System.out.print("Contraseña: ");
      String password = inputUser.nextLine();
      User userFound = null;
      for (User user : userList){
        if (user.getUserName().equals(userName) && user.getPassword().equals(password)){
          userFound = user;
          break;
        }
      }
      if (userFound != null){
        cleanScreen();
        putLine();
        System.out.println("Login success! Bien venido/a "+userFound.getName());
        timer("cargando interfaz: ");
        loginSuccess = true;
        managePrivilege();
      } else {
        System.out.println("Usuario o contraseña incorrectos, desea intentar nuevamente? pulse cualquier tecla!\nPulse n para volver al menu principal");
        String tryAgain = inputUser.nextLine();

        if (tryAgain.equalsIgnoreCase("n")){
          timer("Regresando al Menu Principal: ");
          cleanScreen();
          mainBuild();
          return;
        }

      }
    }
  }

// Metodo Login Admin
public static void managePrivilege() {
  cleanScreen();
  putLine();
  System.out.println("Qué te gustaria hacer:\n1 (Crear Producto)\n2 (Listar Productos)\n3 (Listar usuarios)\n4 (Listar Inventário)\n5 (Salir al menu Principal)");
  
}

}
