
package arraylist;

import java.util.ArrayList;
import java.util.List;


public class Arraylist {

 
    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona(1, "Mónica", 39));
        lista.add(new Persona(2, "Andrés", 45));
        lista.add(new Persona(3, "Martín", 6));
        lista.add(new Persona(4, "Milo", 5));
        
        //Vamos a recorrer la lista por Indice con el for tradicional
        
        System.out.println("---------FOR---------------");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("prueba: " + lista.get(i).getNombre());
            
        }
        System.out.println("--------FOREACH-------------");
        
        //vamos a realizar el recorrido con el foreach, es decir elemento por elemento
        for(Persona perso:lista){
            System.out.println("prueba: " + perso.getNombre());
            
        
        }
            



       
    }
    
}
