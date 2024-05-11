import java.util.ArrayList;
import java.util.Scanner;
import Class.*;
import Utils.*;

public class TiendaApp{
  public static void main(String[] args){
    System.out.println("Bien Venidos a la Tienda de Zapatos Caros!");
    System.out.println("Tenemos 3 categorias de zapatos:");
    double totalCarrito = 0;
    int option;
    Scanner scan = new Scanner(System.in);
    ArrayList<Zapatos> stock = new ArrayList<>();
    Methods.fillStock(stock);
    do {
      System.out.println("Elija una categoria:\n1-Casual\n2-Deportista\n3-Elegante.\n4-Ninguno, Salir!");
      option = scan.nextInt();
      int category = 0;
      switch (option) {
        case 1:
          category = 1;
          System.out.println("Casual Stock, Cúal de estos 2 modelos te gustaria? 1-primero/2-segundo");
          System.out.println(Methods.showShoes(1, stock));
          totalCarrito += Methods.select(scan.nextInt(), stock, category);
          System.out.format("Producto comprado!\nPrecio añadido al carrito total: %.2f", totalCarrito);
          break;
        case 2:
          category = 2;
          System.out.println("Deportista Stock, Cúal de estos 2 modelos te gustaria? 1-primero/2-segundo");
          System.out.println(Methods.showShoes(2, stock));
          totalCarrito += Methods.select(scan.nextInt(), stock, category);
          System.out.format("Producto comprado!\nPrecio añadido al carrito total: %.2f", totalCarrito);
          break;
        case 3:
          category = 3;
          System.out.println("Elegante Stock, Cúal de estos 2 modelos te gustaria? 1-primero/2-segundo");
          System.out.println(Methods.showShoes(3, stock));
          totalCarrito += Methods.select(scan.nextInt(), stock, category);
          System.out.format("Producto comprado!\nPrecio añadido al carrito total: %.2f", totalCarrito);
          break;
        case 4:
          System.out.println("Gracias por visitar nuestra Tienda!");
        default:
          System.out.println("Opcion no válida! intente otra opción.");
          break;
      }
      if (option != 4){
        System.out.print("\nQuieres seguir comprando? tecle:\n1-Casual\n2-Deportista\n3-Elegante\nTecle 4-Salir: ");
      }
    } while(option != 4);
    System.out.format("Total a pagar: %.2f€\n", totalCarrito);
    scan.close();
  }
}