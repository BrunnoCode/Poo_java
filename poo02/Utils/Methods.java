package Utils;
import Class.*;
import java.util.ArrayList;

public class Methods{
  public static void fillStock(ArrayList<Zapatos> stock){
     // Añadiendo categorias al estoque
     stock.add(0, new Casual());
     stock.add(1, new Casual());
     stock.add(2, new Elegante());
     stock.add(3, new Elegante());
     stock.add(4, new Deportista());
     stock.add(5, new Deportista());
 
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
 
     // Elegante
     stock.get(2).setMarca("Faretti");
     stock.get(2).setModelo("ROSSI");
     stock.get(2).setMaterial("Cuero");
     stock.get(2).setTalla(40);
     stock.get(2).setPrecio(134.90);
     
     stock.get(3).setMarca("HUGO BOSS");
     stock.get(3).setModelo("Derby");
     stock.get(3).setMaterial("Piel de Vacuno");
     stock.get(3).setTalla(43);
     stock.get(3).setPrecio(199.98);
     
     // Deportista
     stock.get(4).setMarca("Nike");
     stock.get(4).setModelo("AirMax");
     stock.get(4).setMaterial("Caucho");
     stock.get(4).setTalla(42);
     stock.get(4).setPrecio(132.99);
 
     stock.get(5).setMarca("PUMA");
     stock.get(5).setModelo("RS-X Efekt PRM");
     stock.get(5).setMaterial("45.50% Piel de vacuno, 29.60% Textil, 24.90% Sintético");
     stock.get(5).setTalla(39);
     stock.get(5).setPrecio(120.00);
  }

  public static String showShoes(int shoesCategory, ArrayList<Zapatos> stock){
    String res = "";
    switch (shoesCategory) {
      case 1:
        res = stock.get(0).toString()+"\n"+stock.get(1).toString()+"\n";
        break;
      case 2:
        res = stock.get(2).toString()+"\n"+stock.get(3).toString()+"\n";
        break;
      case 3:
        res = stock.get(4).toString()+"\n"+stock.get(5).toString()+"\n";
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
        if (option == 1)
          total = stock.get(0).getPrecio();
        else if(option == 2)
          total = stock.get(1).getPrecio();
        break;
      case 2:
        if (option == 1)
          total = stock.get(2).getPrecio();
        else if(option == 2)
          total = stock.get(3).getPrecio();
        break;
      case 3:
        if (option == 1)
          total = stock.get(4).getPrecio();
        else if(option == 2)
          total = stock.get(5).getPrecio();
        break;
      default:
        System.out.println("Error select Method!");
        break;
    }
    return total;
  }
}