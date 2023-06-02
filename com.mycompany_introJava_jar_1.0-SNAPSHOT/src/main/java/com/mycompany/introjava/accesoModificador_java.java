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
public class accesoModificador_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int num1 = 5;
        int num2 = 7;

        //puedo invocar el retorno de una funcion de esta manera
        System.out.println("La suma de ambos números es: " + sumar(num1, num2));

        //Pero, recomendamos hacerlo de esta manera, ya que los retornos deben alojarse en variables
        //para su posterior uso
        int retorno = sumar(num1, num2);
        System.out.println("La suma de los dos números es: " + retorno);

    }
    
    public static int sumar (int num1, int num2){
        
        int suma; 
        
        suma = num1 + num2;
        
        return suma;
    
    }

}
