//Realizar un programa que permita cargar 15 números en un vector, una vez cargados, se necesita que el programa
//cuente e informe por pantalla cuantas veces se cargó el número 3.

package vector;

import java.util.Scanner;


public class Vector {

    public static void main(String[] args) {
        
     //Declarar el vector
     
     int vector [] = new int [15];
     
     Scanner leer = new Scanner(System.in);
     
     //Vamos a cargar el vector
     
        for (int i = 0; i < 15; i++) {
            
            System.out.println("Ingrese un número para el vector");
            
            vector [i] = leer.nextInt();
            
        }
        
        //recorrer cuantos numeros 3 hay
        
        int cont = 0;
        
        for (int i = 0; i < 15; i++) {
            
            if (vector[i] == 3) {
                cont = cont + 1;
                
                
                
                
                    
            }
            
        }
        
        System.out.println("La cantidad de números 3 que hay en el vector es: " + cont);
        
        


       
    }
    
}
