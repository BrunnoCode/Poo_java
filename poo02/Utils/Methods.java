package Utils;
import Class.*;
import java.util.ArrayList;

public class Methods{
  public static void fillStock(ArrayList<Zapatos> stock){
     // Añadiendo categorias al estoque
     stock.add(new Casual());
     stock.add(new Casual());
     stock.add(new Elegante());
     stock.add(new Elegante());
     stock.add(new Deportista());
     stock.add(new Deportista());
 
     // Casual
     stock.get(0).setMarca("New Balance");
     stock.get(0).setModelo("240v 72");
     stock.get(0).setMaterial("Caucho");
     stock.get(0).setTalla(42);
     stock.get(0).setPrecio(64.92);
 
     stock.get(1).setMarca("Timberland");
     stock.get(1).setModelo("Seneca Bay Oxford");
     stock.get(1).setMaterial("Cuero");
     stock.get(1).setTalla(40);
     stock.get(1).setPrecio(79.95);
 
     
     // Deportista
     stock.get(2).setMarca("Nike");
     stock.get(2).setModelo("AirMax");
     stock.get(2).setMaterial("Caucho");
     stock.get(2).setTalla(42);
     stock.get(2).setPrecio(132.99);
     
     stock.get(3).setMarca("PUMA");
     stock.get(3).setModelo("RS-X Efekt PRM");
     stock.get(3).setMaterial("45.50% Piel de vacuno, 29.60% Textil, 24.90% Sintético");
     stock.get(3).setTalla(39);
     stock.get(3).setPrecio(120.00);
     // Elegante
     stock.get(4).setMarca("Faretti");
     stock.get(4).setModelo("ROSSI");
     stock.get(4).setMaterial("Cuero");
     stock.get(4).setTalla(40);
     stock.get(4).setPrecio(134.90);
     
     stock.get(5).setMarca("HUGO BOSS");
     stock.get(5).setModelo("Derby");
     stock.get(5).setMaterial("Piel de Vacuno");
     stock.get(5).setTalla(43);
     stock.get(5).setPrecio(199.98);
    }
    
    public static String showShoes(int shoesCategory, ArrayList<Zapatos> stock){
    String res = "";
    String line = "\n-------------------\n";
    switch (shoesCategory) {
      case 1:
        res = "Primero:"+line+stock.get(0).toString()+line+"Segundo:"+line+stock.get(1).toString()+line;
        break;
      case 2:
        res = "Primero:"+line+stock.get(2).toString()+line+"Segundo:"+line+stock.get(3).toString()+line;
        break;
      case 3:
        res = "Primero:"+line+stock.get(4).toString()+line+"Segundo:"+line+stock.get(5).toString()+line;
        break;
      default:
        System.out.println("Seleción no válida! 1, 2 o 3");
        break;
    }
    return res;
  }

  public static double select(int option, ArrayList<Zapatos> stock, int category){
    double total = 0;
    switch (category) {
      case 1:
        if (option == 1){
          System.out.println(stock.get(0).getMarca()+" selecionado!");
          total = stock.get(0).getPrecio();
        }
        else if(option == 2){
          System.out.println(stock.get(1).getMarca()+" selecionado!");
          total = stock.get(1).getPrecio();
        } else {
          System.out.println("Esta opción no existe, fim de programa!");
          return -1;
        }
        break;
      case 2:
        if (option == 1){
          System.out.println(stock.get(2).getMarca()+" selecionado!");
          total = stock.get(2).getPrecio();
        }
        else if(option == 2){
          System.out.println(stock.get(3).getMarca()+" selecionado!");
          total = stock.get(3).getPrecio();
        }else {
          System.out.println("Esta opción no existe, fim de programa!");
          return -1;
        }
        break;
      case 3:
        if (option == 1){
          System.out.println(stock.get(4).getMarca()+" selecionado!");
          total = stock.get(4).getPrecio();
        }
        else if(option == 2){
          System.out.println(stock.get(5).getMarca()+" selecionado!");
          total = stock.get(5).getPrecio();
        }else {
          System.out.println("Esta opción no existe, fim de programa!");
          return -1;
        }
        break;
      default:
        System.out.println("Error select Method!");
        break;
    }
    return total;
  }
}