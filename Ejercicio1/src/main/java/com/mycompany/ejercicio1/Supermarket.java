/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

import com.mycompany.ejercicio1.Utils.Methods;

/**
 *
 * @author bbotelho42
 */
public class Supermarket {

    public static void main(String[] args) {
       Methods.putLine();
       System.out.println("Bien Venido al Supermercado\n1 (Login)\n2 (Crear cuenta)\n3 (salir)");
       Scanner inputUser = new Scanner(System.in);
       int value = 0;
       boolean validInput = false;
       while(!validInput){
        if (inputUser.hasNextInt()){
            value = inputUser.nextInt();
            if (value >= 1 && value <= 3){
                Methods.managerUserInput(value); // controlamos la entrada del usuario
                validInput = true;
            } else {
                Methods.putLine();
                System.out.println("Porfavor introduzca um numero entre 1 a 3!");
            }
        } else {
            Methods.putLine();
            System.out.println("Introduzca un valor numerico!\n1 (Login)\n2 (Crear cuenta)\n3 (salir)");
            inputUser.next();

        }
    }
    inputUser.close(); 
       
    }

    
}
