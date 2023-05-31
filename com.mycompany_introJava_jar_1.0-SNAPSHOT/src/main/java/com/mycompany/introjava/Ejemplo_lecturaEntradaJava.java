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
public class Ejemplo_lecturaEntradaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lectura de entrada en java según el tipo de dato
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Con esta clase guardamos valopres ingresados por consola en las variables");
        
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
    }
    
}
