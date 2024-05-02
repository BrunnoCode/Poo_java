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
      System.out.println("Introduzca los datos del Ordenador:\n----------------------");
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
      scan.nextLine();
    }
    for (Computer x : pcs){
      System.out.format("\nMarca: %s\nModelo: %s\nRam: %d GB\nArmazenamiento: %d GB\nPrecio: %.2f €\n\n--------------------------\n", x.getBrand(), x.getModel(), x.getRam(), x.getMem(), x.getPrice());
    }
    scan.close();
  }
} 