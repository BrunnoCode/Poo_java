package Utils;

public class Methods{

  //UTILS METHODS
  public static float sizeCalculate(float sizeX, float sizeY, float sizeZ){
      return (sizeX + sizeY + sizeZ);
  }

  public static void selectMessage(){
    System.out.println("1-Crear lista de Juguetes.\n2-Elegir Juguete a ser enviado.\n3-Listar todos los juguetes añadidos.\n4-Editar o eliminar juguetes\n5-salir");
  }

  public static void cleanScreen(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
  //USR METHODS
  
}