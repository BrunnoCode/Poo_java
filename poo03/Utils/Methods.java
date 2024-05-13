package Utils;

public class Methods{
  // Printar Alfabeto minusculas y mayusculas
  public static void printAlpha(){
    int i = 65;
    while (i <= 122){
      if (i > 90 && i < 97)
        i++;
      else
        System.out.format("%c", i++);
      if (i == 91)
        System.out.format(" ");
    }
    System.out.println();
  }

  // Printar char segun numero dado por el usuario
  public static void printAscii(int c){
    System.out.format("%c\n", c);
  }

  // Salto de linha \n *4
  public static void jumpNline(){
    System.out.println("\n\n----------------------------------\n");
  }

 public static void porcentaje(int pct){
  for (int i = 0; i < pct; i++){
    System.out.format("#");
  }
 }
 public static 
}