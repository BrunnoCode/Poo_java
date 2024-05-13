//para printar todo el alfabeto de mayuscula y minuscula:

import java.util.*;

public class test{
 public static void main(String[] args){
    int i = 65;

    while(i <= 90){
           System.out.format("%c", i++);
    }
    System.out.println();
     while(i <= 122){
         if (i >= 97 && i <= 122){
            System.out.format("%c", i);
         }
         i++;
     }
    System.out.println();
  }
}
