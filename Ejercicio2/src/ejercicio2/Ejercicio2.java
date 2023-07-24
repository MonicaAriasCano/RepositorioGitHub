/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import Entidades.Circunferencia;
import Servicios.ServicioCircunferencia;

/**
 *
 * @author Mónica A
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circunferencia circ= new Circunferencia(0);
        
        ServicioCircunferencia serv= new ServicioCircunferencia();
        
        serv.crearCircunferencia(circ);
        double Area =serv.Area(circ);
        double Perimetro=serv.Perimetro(circ);
        
        System.out.println("El Area es: "+Area + " Y el perimetro es: "+Perimetro );
    }
    
}
        
        
        
    
    
