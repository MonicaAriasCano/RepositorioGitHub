/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

/**
 *
 * @author Nicolas Aguero
 */

import entidad.Vehiculo;
import java.util.Scanner;

public class VehiculoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Vehiculo crearVehiculo(){
        boolean bandera = false;
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Ingrese la marca del vehiculo");
        vehiculo.setMarca(leer.next());
        System.out.println("Ingrese el modelo del vehiculo");
        vehiculo.setModelo(leer.next());
        System.out.println("Ingrese el año del vehiculo");
        vehiculo.setAño(leer.nextInt());
        System.out.println("Ingrese el tipo del vehiculo");
        
        vehiculo.setTipo(leer.next());
        
        do{
            if (vehiculo.getTipo().equals("automovil") || vehiculo.getTipo().equals("motocicleta") || vehiculo.getTipo().equals("bicicleta") ){
                bandera = true;
            } else{
                System.out.println("Error! Ingrese el tipo nuevamente");
                vehiculo.setTipo(leer.next());
            }
        }while (bandera == false);   
        
        return vehiculo;
       
    }
    
    public int Moverse (Vehiculo vehiculo){
        int segundos;
        int metros = 0;
        System.out.println("Ingrese una cantidad de segundos");
        segundos = leer.nextInt();
        
        if (vehiculo.getTipo().equals("automovil")){
            metros = 3*segundos;
        } else if (vehiculo.getTipo().equals("motocicleta")){
            metros = 2*segundos;
        } else if (vehiculo.getTipo().equals("bicicleta")){
            metros = 1*segundos;
        }
        
        return metros;
                
    }
    
   public int Frenar (Vehiculo vehiculo){
       
       if (vehiculo.getTipo().equals("bicicleta")){
           return 0;
       } else {
           return 2;
       }
   } 
}
