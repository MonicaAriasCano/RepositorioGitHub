/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CircunferenciaService {
    Scanner read = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        System.out.print("Ingrese el radio: ");
        Circunferencia cir = new Circunferencia(read.nextDouble());
        return cir;
    }
    
    public void mostrarCircunferencia(Circunferencia c){
        
        System.out.println("El radio es: " + c.getRadio());
        System.out.println("El Área es: " + c.calculoArea());
        System.out.println("El Perímetro es: " + c.calculoPerimetro());
    }
}
