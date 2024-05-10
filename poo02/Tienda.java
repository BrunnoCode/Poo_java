import java.util.ArrayList;
import java.util.Scanner;

public class Tienda{
  public static void main(String[] args){
    System.out.println("Bien Venidos a la Tienda de Sapatos Caros!");
    System.out.println("Tenemos 3 categorias de zapatos:\n1-Casual\n2-Deportista\n3-Elegante.\n");
    
   
    ArrayList<Zapatos> stock = new ArrayList<>();

    // Añadiendo categorias al estoque
    stock.add(new Casual());
    stock.add(new Elegante());
    stock.add(new Deportista());

    // Casual
    stock.get(0).setMarca("New Balance");
    stock.get(0).setModelo("240v 72");
    stock.get(0).setMaterial("Caucho");
    stock.get(0).setTalla(42);
    stock.get(0).setPrecio(64.92);

    // Deportista
    stock.get(1).setMarca("New Balance");
    stock.get(1).setModelo("240v 72");
    stock.get(1).setMaterial("Caucho");
    stock.get(1).setTalla(42);
    stock.get(1).setPrecio(64.92);
    
    
    
    
    Scanner scan = new Scanner(System.in);

    scan.close();
  }
}