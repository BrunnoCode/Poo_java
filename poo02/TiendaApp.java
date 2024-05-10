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
          System.out.println("Casual Stock, Cúal de estos modelos te gustaria?");
          for (Zapatos x : )
          
          break;
      
        default:
          break;
      }

    } while(off);


   
    
    

    scan.close();
  }
}