import java.util.ArrayList;
import java.util.Scanner;

public class pcStore{
  public static void main(String[] args){
    System.out.println("Lista de ordenadores\n cúantos ordenadores quieres fichar?");
    Scanner scan = new Scanner(System.in);
    ArrayList<Computer> pcs = new ArrayList<>();
    int len = scan.nextInt();
    Computer pc;
    for (int x = 0; x < len; x++){
      pcs.add((pc));
    }
    scan.nextLine();
    for (int i = 0; i < len; i++){
      System.out.println("Introduzca los datos del Ordenador:");
      System.out.print("Marca: ");
      pcs.get(i).setBrand(scan.nextLine());
      System.out.print("Modelo: ");
      pcs.get(i).setModel(scan.nextLine());
      System.out.print("Ram: ");
      pcs.get(i).setRam(scan.nextInt());
      System.out.print("Armazenamiento: ");
      pcs.get(i).setMem(scan.nextInt());
      scan.nextLine();
    }
    System.out.println("Todos ordenadores añadidos\n" + pcs);
    scan.close();
  }
} 