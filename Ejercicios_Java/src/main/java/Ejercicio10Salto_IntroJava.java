
import java.util.Scanner;

/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
 *solicite números al usuario hasta que la suma de los números introducidos supere el
 *límite inicial.
 */

/**
 *
 * @author Mónica A
 */
public class Ejercicio10Salto_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int suma = 0;
        
        
        System.out.println("Ingrese valor limite");
         int numLimite  = leer.nextInt();
         
         do{
             System.out.println("Ingrese un numero");
             int num = leer.nextInt();
             
             suma = suma + num;
             
             
         
         }while(numLimite > suma);
         
         System.out.println("La suma de los números es: " + suma);
        
        
    
    }
       
       
        
        
       
    }
    

