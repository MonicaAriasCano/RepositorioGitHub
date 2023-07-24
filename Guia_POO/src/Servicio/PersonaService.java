/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        // La idea es crear el objeto en esta clase y pasarlo a través del return
        
        Persona personaCompleta = new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        
        personaCompleta.setNombre(leer.next());
        
        return personaCompleta;
    }
    
    public void mostrarPersona(Persona per){
        // La idea es mostrar los atributos del objeto a través de la clase servicio
        
        System.out.println("La persona es: "+per.getNombre());
        
    }
}
