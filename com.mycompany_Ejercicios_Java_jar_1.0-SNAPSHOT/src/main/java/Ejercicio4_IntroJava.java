
import java.util.Scanner;

/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 *Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

/**
 *
 * @author Mónica A
 */
public class Ejercicio4_IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        double gradosC;
        double gradosF;
        
        
       
        System.out.println("Por favor ingrese los grados centigrados");
        gradosC = leer.nextDouble();
        gradosF = 32 +(9 * gradosC / 5);
        
        System.out.println("El equivalente en grados fahrenheit es: " +gradosF);   
    }
    
}
