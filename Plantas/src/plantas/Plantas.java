/*
 * Crea una clase planta con los atributos: nombre, alto del tallo, tieneHojas, climaIdeal, 
Con sus metodos y constructores pertinentes.

Crear sus clases hijas que compartan sus atributos y metodos:
- Arbol: variedad, tipo de Tronco, radio de tronco, color, tipo de hojas
-Flor: color de petalos,cantidad promedio de petalos, color de pistilo, color de los petalos, variedad de flor, estación en la cual florece.
-Arbusto: Ancho arbusto, esDomestico, variedadarbusto, color de hojas, sePodaoNo



 */
package plantas;

/**
 *
 * @author Mónica A
 */
public class Plantas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arbol arbolito = new Arbol();
        Flor florecita = new Flor();
        Arbusto arbustito = new Arbusto();
        
        arbolito.decirLoQueSoy();
        florecita.decirLoQueSoy();
        arbustito.decirLoQueSoy();
        
        
       
    }
    
}
