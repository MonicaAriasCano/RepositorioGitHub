
import java.util.Scanner;

/*
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 *en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
 *Java.
 *
 */

/**
 *
 * @author Mónica A
 */
public class Ejercicio3_IntroJva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herenew
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        System.out.println("Su frase en mayuscula es: "+ frase.toUpperCase());
        System.out.println("Su frase en minuscula  es: "+ frase.toLowerCase());
    }
    
}
