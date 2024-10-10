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
        System.out.println("Ejercicio 1");
        Person persona1;
        persona1 = new Person(
            4588,
            "Jose",
            "josemanoel@gmail.com",
            "+34 654 984 655",
            false,
            LocalDate.now(),
            LocalDate.now(), true
        );
        System.out.println(persona1.toString());
    }
}
