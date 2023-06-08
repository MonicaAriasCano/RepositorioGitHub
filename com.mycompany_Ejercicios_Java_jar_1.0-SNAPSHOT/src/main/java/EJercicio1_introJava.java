
import java.util.Scanner;

/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    dos. El programa deberá después mostrar el resultado de la suma
 * 
 */

/**
 *
 * @author Mónica A
 */
public class EJercicio1_introJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        
        System.out.println("Ingrese 2  números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de los dos numeros es: " +suma);
        
        
    }
    
}
