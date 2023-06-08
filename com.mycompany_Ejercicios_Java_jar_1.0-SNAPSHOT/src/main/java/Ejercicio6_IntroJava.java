
import java.util.Scanner;

/*
 * Crear un programa que dado un numero determine si es par o impar.
 * 
 */
/**
 *
 * @author Mónica A
 */
public class Ejercicio6_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();

        if (numero % 2 == 0) {

            System.out.println("El numero es par");

        }else{
            
            System.out.println("El numero es Impar");
        
        }

    }

}


