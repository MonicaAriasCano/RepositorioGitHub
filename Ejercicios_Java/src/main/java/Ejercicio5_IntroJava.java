
import java.util.Scanner;

/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 *doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
 *Math.sqrt().
 */

/**
 *
 * @author Mónica A
 */
public class Ejercicio5_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        int numero = leer.nextInt();
        double raiz = Math.sqrt(numero);
         System.out.println("El doble del número es: " + numero * 2);
         System.out.println("El triple del numero es: " + numero * 3);
         System.out.println("La raiz cuadrada del numero es: " + raiz);
    }
    
}
