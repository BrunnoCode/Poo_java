import java.util.ArrayList;
import java.util.Scanner;
import Class.*;
import Utils.*;

public class TiendaApp{
  public static void main(String[] args){
    System.out.println("Bien Venidos a la Tienda de Zapatos Caros!");
    System.out.println("Tenemos 3 categorias de zapatos:");
    double totalCarrito = 0;
    String line = "\n**********************************\n";
    int option = 0;
    Scanner scan = new Scanner(System.in);
    ArrayList<Zapatos> stock = new ArrayList<>();
    Methods.fillStock(stock);
    do {
      if (option == 0){
        System.out.println("Elija una categoria:\n1-Casual\n2-Deportista\n3-Elegante.\n4-Ninguno, Salir!");
      }
      option = scan.nextInt();
      int category = 0;
      switch (option) {
        case 1:
          category = 1;
          System.out.println("\nCasual Stock, Cúal de estos 2 modelos te gustaria? 1-primero/2-segundo");
          System.out.println(Methods.showShoes(1, stock));
          totalCarrito += Methods.select(scan.nextInt(), stock, category);
          if (totalCarrito == -1)
            return ;
          System.out.format("Producto comprado!\nPrecio añadido al carrito total: %.2f %s", totalCarrito, line);
          break;
        case 2:
          category = 2;
          System.out.println("\nDeportista Stock, Cúal de estos 2 modelos te gustaria? 1-primero/2-segundo");
          System.out.println(Methods.showShoes(2, stock));
          totalCarrito += Methods.select(scan.nextInt(), stock, category);
          if (totalCarrito == -1)
            return ;
          System.out.format("Producto comprado!\nPrecio añadido al carrito total: %.2f %s", totalCarrito, line);
          break;
        case 3:
          category = 3;
          System.out.println("\nElegante Stock, Cúal de estos 2 modelos te gustaria? 1-primero/2-segundo");
          System.out.println(Methods.showShoes(3, stock));
          totalCarrito += Methods.select(scan.nextInt(), stock, category);
          if (totalCarrito == -1)
            return ;
          System.out.format("Producto comprado!\nPrecio añadido al carrito total: %.2f %s", totalCarrito, line);
          break;
        case 4:
          System.out.println("\n\nGracias por visitar nuestra Tienda!");
          break;
        default:
          System.out.println("Opcion no válida! intente otra opción.");
          return;
      }
      if (option < 4){
        System.out.print("\nQuieres seguir comprando? tecle:\n1-Casual\n2-Deportista\n3-Elegante\nTecle 4-Salir: ");
      }
    } while(option < 4);
    System.out.format("Total a pagar: %.2f€\n", totalCarrito);
    scan.close();
  }
}