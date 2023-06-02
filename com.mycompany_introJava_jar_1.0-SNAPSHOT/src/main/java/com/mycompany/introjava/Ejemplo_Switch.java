/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.introjava;

import java.util.Scanner;

/**
 *
 * @author Mónica A
 */
public class Ejemplo_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Vamos a declarar las variables
        int opcion;

        System.out.println("Ingrese una opcion");

        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Esta linea de codigo se ejecuta si opcion = 1");
                break;
            case 2:
                System.out.println("Esta linea de codigo se ejecuta si opcion = 2");
                break;
            default:
                System.out.println("El valor ingresado en la variable opcion es diferente" + "a todos los casos analizados por el switch");

        }

    }

}
