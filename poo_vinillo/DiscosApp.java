import Utils.Methods;

import java.util.ArrayList;
import java.util.Scanner;

import Class.Disco;

public class DiscosApp{
  public static void main(String[] args){
    System.out.println("Bienvenidos a la coleccion de Discos!");
    Methods.putLine();
    Scanner scan = new Scanner(System.in);
    int opt;
    ArrayList<Disco> discos = new ArrayList<>();
    int i = 5;
    do{
       if(discos.size() == 0){
        System.out.println("Todavía no hay discos añadidos! presione 1 para añadir o 0 para salir.");
       } else if (discos.size() < 1){
        System.out.println("Añadir almenos 5 discos todavía faltan: "+ --i + " presione 1 para crear o 0 para cancelar y salir");
       } else {
        System.out.println("Añadir uno más presione 1\nver lista añadida presione 2\nmodificar presione 3\nsalir presione 0");
       }
       opt = Integer.parseInt(scan.nextLine());
       Methods.userAction(opt, discos, scan);
    } while (opt != 0);
    scan.close();
  }
}