import java.util.ArrayList;
import java.util.Scanner;
import Class.*;
import Utils.*;

public class TiendaApp{
  public static void main(String[] args){
    System.out.println("Bien Venidos a la Tienda de Zapatos Caros!");
    System.out.println("Tenemos 3 categorias de zapatos:\n1-Casual\n2-Deportista\n3-Elegante.\n4-Ninguno, Salir!");
    double totalCarrito = 0;
    Scanner scan = new Scanner(System.in);
    ArrayList<Zapatos> stock = new ArrayList<>();
    Methods.fillStock(stock);
    int option = scan.nextInt();
    do {
      switch (option) {
        case 1:
          System.out.println("Casual Stock, Cúal de estos 2 modelos te gustaria? 1-primero/2-segundo");
          System.out.println(Methods.showShoes(stock, 0, 1));
          totalCarrito += Methods.select(scan.nextInt(), stock, 0, 1);
          System.out.println("Producto comprado!\nPrecio añadido al carrito total: " + totalCarrito+"€");
          break;
        case 2:
          System.out.println("Deportista Stock, Cúal de estos 2 modelos te gustaria? 1-primero/2-segundo");
          System.out.println(Methods.showShoes(stock, 2, 3));
          totalCarrito += Methods.select(scan.nextInt(), stock, 2, 3);
          System.out.println("Producto comprado!\nPrecio añadido al carrito total: " + totalCarrito+"€");
          break;
        case 3:
          System.out.println("Elegante Stock, Cúal de estos 2 modelos te gustaria? 1-primero/2-segundo");
          System.out.println(Methods.showShoes(stock, 3, 4));
          totalCarrito += Methods.select(scan.nextInt(), stock, 4, 5);
          System.out.println("Producto comprado!\nPrecio añadido al carrito total: " + totalCarrito+"€");
          break;
        default:
          System.out.println("Opcion no válida! intente otra opción.");
          break;
      }
      if (option != 4){
        System.out.print("\nQuieres seguir comprando? tecle:\n1-Casual\n2-Deportista\n3-Elegante\nTecle 4-Salir: ");
        option = scan.nextInt();
      }
    } while(option != 4);
    System.out.format("Gracias por visitar nuestra tienda total a pagar: %.2f€\n", totalCarrito);
    scan.close();
  }
}