
package mascotapp;
//vamos a interactuar entre la clase main, y las otras clases que creamos

import java.util.Scanner;
import mascotapp.Entidades.Mascota;


public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // vamoa a crear nuestro primer objeto e interactuaremos con la clase Mascota
        Scanner leer = new Scanner(System.in);
        
        Mascota m1 = new Mascota("Fernando Chiquito", leer.next(), "Perro");// La variable m1 va ser de tipo Mascota "Mascota m1",esto es donde lo asigno y "new Mascota()"  , y con  con esto oficialmente ha nacido el objeto. 
        
        //Vamos a darle caracteristicas a nuestra variable "m1"
        
        m1.setNombre("Pepe chiquito");
        
        System.out.println(m1.getNombre());
        System.out.println(m1);
       
        
        
        
        
        
       
        
       
                

        
    }
    
}
