import java.util.ArrayList;
import java.util.Scanner;

import Class.Toy;
import Utils.Methods;

public class ToyStoreApp{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Toy> toys = new ArrayList<>();
    Methods.cleanScreen();
    System.out.println("\n**** Bien venidos a La tienda de Juguetes!!!****");
    int usr = 0;
    do {
      if (toys.size() == 0){
        System.out.println("\nXXXXXXXX Todavía no hay Juguetes añadidos!!!, presione Enter XXXXXXXX\n");
        scan.nextLine();
        Methods.cleanScreen();
      }
      Methods.selectMessage();
      usr = Integer.parseInt(scan.nextLine());
      Methods.usrSelection(toys, usr, scan);
    } while(usr != 5);
    scan.close();
  }
}