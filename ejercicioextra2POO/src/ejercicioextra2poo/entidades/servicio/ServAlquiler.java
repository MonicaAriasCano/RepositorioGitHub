/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2poo.entidades.servicio;

import ejercicioextra2poo.entidades.Alquiler;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author copec
 */
public class ServAlquiler {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Alquiler CrearAlquiler(){
    Alquiler a = new Alquiler();
        System.out.println(" Indique que pelicula alquilara");
        a.setNombrePelicula(leer.next());
        Date hoy = new Date();
        a.setfInicio(hoy);
        System.out.println("Cuantos dias alquilaras");
        int dFinal = leer.nextInt();
        int mFinal = leer.nextInt();
        int aFinal = leer.nextInt();
        Date fFinal = new Date(aFinal-1900,mFinal-1,dFinal);
        a.setfFin(fFinal);
        int dTotal = fFinal.getDate()-hoy.getDate();
        if (dTotal <= 3 ){
        a.setPrecio(10);
        
        }else {
            a.setPrecio(10+(dTotal-3)*0.1);
        }
    
        return a;
        
            
          
      
    }  
}
