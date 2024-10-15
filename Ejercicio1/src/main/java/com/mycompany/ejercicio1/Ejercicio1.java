/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;
import java.time.LocalDate;

/**
 *
 * @author bbotelho42
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       System.out.println("Gestor de Supermercado\nHaga Login para gestionar o crea una cuenta:");
       boolean out = false;
       do {

       } while(!out);
       putLine();
       


    }

    // Metodo limpiar pantalla
    public static void cleanScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    // Metodo Timer causa un delay en pantalla
    public static void timer(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // Metodo creador de linea en pantalla
    public static void putLine(){
        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
      }
}
