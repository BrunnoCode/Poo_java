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
    boolean off = true;
    do {

      switch (option) {
        case 1:
          System.out.println("Casual Stock, Cúal de estos 2 modelos te gustaria? 1-primero/2-segundo");
          for (int i = 0; i < 1; i++){
            stock.get(i).toString();
          }
          totalCarrito += Methods.select(scan.nextInt());
          
          break;
      
        default:
          break;
      }

    } while(off);


   
    
    

    scan.close();
  }
}