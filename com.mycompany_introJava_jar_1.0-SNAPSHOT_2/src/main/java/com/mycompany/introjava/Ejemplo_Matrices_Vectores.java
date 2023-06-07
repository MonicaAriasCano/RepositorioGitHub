/*
 *Realizar la multiplicación de un vector por una matriz, dado un vector 1xN y una matriz NXM, el resultado 
del producto es 1xM

EJEMPLO: vector 1x2 * matriz 2*3 = producto 1*3

v = |3,5| m= |4,8,6|= |3*4 + 5*2+ 3*8 +5*1+3*6+5*7|=|22, 29, 53|
             |2,1,7|
 */
package com.mycompany.introjava;

import static java.lang.Double.sum;
import java.util.Scanner;

/**
 *
 * @author Mónica A
 */
public class Ejemplo_Matrices_Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración y creación de un vector
        // Tipo [] nombreVector = new tipo  [ ]

        //Declarar un arreglo de una dimensión
        int[] vector;
        //crear en memoria (construir/dimensionar) con el valor por defecto (0 para todos los enteros)
        // los dos pasos en una linea 
        vector = new int[2];
        int[] producto = new int[3];

        //Declaración y creación de una matriz
        // tipo[][] nombreMatriz = new tipo [filas][Columnas]
        //Declaración e inicialización con valores predeterminados
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}};

        //Declaración y creación de arreglos genéricos
        //tipo[][]...[] nombre del arreglo = new tipo [cardinalidad 1][cardinalidad 2]....[cardinalodad N]
        System.out.println("Ingtese los valores del vector de tamaño " + vector.length + ":");
        Scanner leer = new Scanner(System.in);

        // int = 0;porque los subindices en java comienzan desde cero
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v[" + i + "]=");
            //acceder al valor de i del vector
            vector[i] = leer.nextInt();

        }

        //multiplivca vector por matriz
        int suma;
        //....para cada columna de la matriz
        for (int j = 0; j < vector.length; j++) {
            suma = 0;
            // rrecorro el vector y multiplico
            for (int i = 0; i < vector.length; i++) {
                suma += vector[i] * matriz[i][j];

            }

            producto[j] = suma;

        }
        String aux = "";

        //Mostrar Vector
        System.out.println("* vector:");
        //bucle for "mejorado" (enhanced)
        //for (tipo elemento: arreglo)
        for (int elemento : vector) {
            aux = aux + " " + elemento;

        }

        System.out.println("aux");

        //Mostrar matriz
        System.out.println("\n* Matriz:");
        //para cada fila de la matriz
        for (int[] fila : matriz) {
            aux = "";
            //para cada elemento de la fila de la matriz
            for (int elemento : fila) {
                aux += " " + elemento;

            }

            System.out.println("aux");

        }

        //Mostrar resultado
        aux = "";
        System.out.println("\n vector por matriz");
        for (int elemento : producto) {

            aux += " " + elemento;

        }

        System.out.println("aux");

    }

}


