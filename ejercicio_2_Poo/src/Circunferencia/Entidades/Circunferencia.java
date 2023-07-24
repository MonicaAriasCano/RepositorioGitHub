/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circunferencia.Entidades;

import java.util.Scanner;

/**
 *
 * @author Mónica A
 */
public class Circunferencia {
    
    public class ServicioCircunferencia {
    Scanner leer = new Scanner(System.in); 
    
    public void crearCircunferencia(Circunferencia circ){ 
        System.out.println("Ingrese el Radio");
        circ.setRadio(leer.nextDouble());
}
    public double Area(Circunferencia circ){

        return (Math.PI * circ.getRadio()*circ.getRadio() ); 
}
   public double Perimetro(Circunferencia circ){

        return (Math.PI * circ.getRadio()*2); 
}
}
    
}
