
import java.util.Scanner;

/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
 *pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
 *investigar la función equals() en Java.
 *
 */

/**
 *
 * @author Mónica A
 */
public class Ejercicio7_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        String frase;
        String pass = "eureka";
        
       
        
        
        System.out.println("Ingrese una frase");
        frase = leer.next();
        
        if (frase.equals(pass)) {
            
            System.out.println("correcto");
            
        }else{
            System.out.println("Incorrecto");
        
        }
        
    }
    
}
