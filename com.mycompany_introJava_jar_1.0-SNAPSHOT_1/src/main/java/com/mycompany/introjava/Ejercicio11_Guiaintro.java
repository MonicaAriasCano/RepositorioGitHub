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
public class Ejercicio11_Guiaintro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        String frase;
        System.out.println("Ingresa una frase para codificar");
        frase = leer.nextLine();
        System.out.println("frase");

        System.out.println("----Encriptando----");
        System.out.println(cript(frase));

    }

    public static String cript(String frase) {

        int cont = frase.length();
        String encript, encriptado;

        encriptado = "";

        System.out.println(cont);

        for (int i = 0; i < cont; i++) {
            encript = frase.substring(i, i + 1);
            switch (encript.toLowerCase()) {

                case "a":
                    encript = "@";
                    break;
                case "e":
                    encript = "#";
                    break;
                case "i":
                    encript = "$";
                    break;
                case "o":
                    encript = "%";
                    break;
                case "u":
                    encript = "*";
                    break;

            }
            
            encriptado = encriptado + encript;

        }
        
        return encriptado;

    }

}
