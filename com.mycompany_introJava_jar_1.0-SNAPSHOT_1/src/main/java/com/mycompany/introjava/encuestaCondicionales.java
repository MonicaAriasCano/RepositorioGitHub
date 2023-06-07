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
public class encuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos una variable de tipo entero
        int opinion;
        // Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //muestra un mensaje por pantalla
        System.out.println("Clasifique la peli de 1 al 5 estrellas");
        //Función de lectura de un entero,se utiliza la función Scanner y leer un tipo de dato entero.
        opinion = leer.nextInt();

        if (opinion >= 1 && opinion <= 5) {
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la pelicula");
                    break;
                case 3:
                    System.out.println("Has calificado la pelicula como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la pelicula como muy buena");
                    break;
                case 5:
                    System.out.println("¡Fantastico que tu experiencia haya sido excelente!");
                    break;
                   
                    //El equivalente al caso del *De otro Modo* es el *Degault*
                    //default:
                    //<acciones>

            }
        }else if(opinion < 0){
            System.out.println("¿una opuinión negativa?, ¿tan mala fue la pelicula? :( ");
        }else if(opinion == 0){
            System.out.println("El valor"  +  opinion  +  "no es valido y no se tomara en cuenta. ;(");
        }else {
            System.out.println(+ opinion + "¡wow! se te fue la mano con la calificación :)");
        }
        
        
    }

}
