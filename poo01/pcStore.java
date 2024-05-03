import java.util.ArrayList;
import java.util.Scanner;

public class pcStore{
  public static void main(String[] args){
    System.out.println("Lista de ordenadores\n cúantos ordenadores quieres fichar?");
    Scanner scan = new Scanner(System.in);
    ArrayList<Computer> pcs = new ArrayList<>();
    int len = scan.nextInt();

    scan.nextLine();
    for (int i = 0; i < len; i++){
      pcs.add(new Computer());
      System.out.println("\nIntroduzca los datos del Ordenador:");
      System.out.print("Marca: ");
      pcs.get(i).setBrand(scan.nextLine());
      System.out.print("Modelo: ");
      pcs.get(i).setModel(scan.nextLine());
      System.out.print("Ram: ");
      pcs.get(i).setRam(scan.nextInt());
      System.out.print("Armazenamiento: ");
      pcs.get(i).setMem(scan.nextInt());
      System.out.print("Precio: ");
      pcs.get(i).setPrice(scan.nextFloat());
      System.out.print("Está Disponible ? (true / false): ");
      pcs.get(i).setStock(scan.nextBoolean());
      scan.nextLine();
    }
    System.out.println();
    System.out.println("Lista completada\n************************");
    for (Computer x : pcs){
      System.out.println(x.toString());
    }
    scan.close();
  }
} 