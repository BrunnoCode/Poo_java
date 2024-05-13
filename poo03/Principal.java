import java.util.Scanner;
import Utils.Methods;

public class Principal{
  public static void main(String[] args){
    System.out.println("Primero apresentaremos nuestros metodos:");
    System.out.println("Metodo printAlpha");
    Methods.printAlpha();
    Methods.jumpNline();
    System.out.println("Ahora un metodo que transforma un int pasado como argumento a una letra!");
    Scanner scan = new Scanner(System.in);
    System.out.print("Insira un numero de 33 hasta 126: ");
    
    while (!scan.hasNextInt()){
      System.out.println("Error! hay que ser un numero dentro del rango mencionado arriba!");
      scan.nextLine();
    }
    Methods.printAscii(scan.nextInt());
    scan.close();
    System.out.println("");
  }
}