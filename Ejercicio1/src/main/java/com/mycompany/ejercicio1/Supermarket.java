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
        Methods.cleanScreen();
        Methods.putLine();
        System.out.println("Bienvenido al Supermercado\n1 (Login)\n2 (Crear cuenta)\n3 (Salir)");

        Scanner inputUser = new Scanner(System.in); 
        int value = 0;
        boolean validInput = false;

        while (!validInput) {
            if (inputUser.hasNextInt()) {
                value = inputUser.nextInt(); 
                if (value >= 1 && value <= 3) {
                    Methods.managerUserInput(value); 
                    validInput = (value == 3);
                    if (!validInput) { 
                        Methods.putLine();
                        System.out.println("Bienvenido al Supermercado\n1 (Login)\n2 (Crear cuenta)\n3 (Salir)");
                    }
                } else {
                    Methods.putLine();
                    System.out.println("Por favor, introduzca un número entre 1 y 3!");
                }
            } else {
                Methods.putLine();
                System.out.println("Introduzca un valor numérico!\n1 (Login)\n2 (Crear cuenta)\n3 (Salir)");
                inputUser.next(); 
            }
        }

        inputUser.close();
    }
}