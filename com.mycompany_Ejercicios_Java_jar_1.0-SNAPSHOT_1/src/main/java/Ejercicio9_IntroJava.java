
import java.util.Scanner;

/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
 *es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
 *que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
 *investigar la función Substring y equals() de Java.
 */

/**
 *
 * @author Mónica A
 */
public class Ejercicio9_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String frase; 
        
        System.out.println("Ingrese una frase");
        frase = leer.next();
        
        if ("A".equals(frase.toUpperCase().substring(0,1))) {
            System.out.println("Correcto la primera letra es una A");
            
        }else{
            
            System.out.println("Incorrecto la primera letra no es una A");
        
        }
    }
    
}
