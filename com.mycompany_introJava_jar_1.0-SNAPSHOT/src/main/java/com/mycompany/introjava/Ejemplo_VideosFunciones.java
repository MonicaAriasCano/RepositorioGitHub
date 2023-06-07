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
public class Ejemplo_VideosFunciones {

    /**
     * @param args the command line arguments
     */
    // Este es el primer metodo que se va a ejecutar cuando ejecutemos la aplicación, este metodo esta contenido 
    //en el metodo class.
    public static void main(String[] args) {

        //Vamos a llamar las funciones desde nuesatro metodo "main"
        int resultado = suma(10, 10); //aqui le vamos a pasar a la función los argumentos, estos argumentos debemos 
        //almacvenarlos en una variable en este caso se llama "resultado", esta variable es local
        //quiere decir que solo esta en el "main".
        
        System.out.println(resultado);
        
        //Es una manera de hacerlo
        saludoPersonalizado("Mónica");
        
        //Otra manera de hacerlo
        Scanner leer = new Scanner(System.in);
        
        String nombre = leer.next();
        saludoPersonalizado(nombre);
        
        //Otra forma de hacerlo
        saludoPersonalizado(leer.next());
        
        
        
        

    }
    //int es un dato primitivo solo alberga el valor, mientras que Integer es una clase nos damos cuenta porque comienza
    //con mayuscula y alberga otros metodos y funcionalidades

    public static int suma(int a, int b) {//METODO QUE RETORNA ALGUN VALOR
        // los parametros que va a recibir es una variable de tipo entero int "a" e int "b"
        // Dentro de este cuerpo vamos a poner la lógica

        int res = a + b;

        //Lo que voy a retornar es la variable que declare en este caso "res"
        return res;

    }

    public static void saludoPersonalizado(String nombre) {// METODO QUE NO RETORNA NINGUN VALOR
        System.out.println("Hola " +nombre+  " como estas?");

    }

}

