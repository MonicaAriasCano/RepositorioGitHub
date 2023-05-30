/*Muestre N sumatorias de los primeros Números enteros partiendo desde 1, siendo N par, 
 * de un aviso si el usuario identifica un valor de N superior a 1000 por ejecución lenta
 */
package com.mycompany.introjava;

import java.util.Scanner;

/**
 *
 * @author Mónica A
 */
public class SumatoriaConSalto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num;
        // creamos la variable del número entero
        Scanner leer = new Scanner(System.in);

        //vamos a iniciar el bucle "hacer", pseint, en Java es "do"
        do {
            System.out.println("Ingrese un número entero positivo");
            num = leer.nextInt();
            if (num > 1000) {
                System.out.println("Este programa podria tardar, ¿Esta Seguro?, (S/N)");
                //Creamos una variable para guaradar el String
                String confirma = leer.next();
                if (confirma.equals("S")) {
                    break;//break, detiene el bucle y continúa con el proximo bloque
                }
            }
        } while (num <= 0 || num > 1000);

    }

}

/*bucle for: 
1. Inicialización de una variable de control
2. La variable de control es utiliada dentro de la expresión "Determinación"
3. Mientras las expresión "Determinación" es VERDADERA el BUCLE se mantiene en ejecución
4. Indicar el PASO de la variable de control
for (<iNICIALIZACIÓN>,<Expresión_Terminación>,<paso/incremento/decremento>){
<Sentencias>
}


*/