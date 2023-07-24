/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2poo;

import ejercicioextra2poo.entidades.Pelicula;
import ejercicioextra2poo.entidades.servicio.ServPelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author copec
 */
public class Ejercicioextra2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Pelicula> lista = new ArrayList<>();
        ServPelicula sP = new ServPelicula();
        for (int i = 0; i < 3; i++) {
            lista.add(sP.CrearPelicula());
            
        }
        System.out.println(lista);
        System.out.println(sP.BuscarPelicula(lista));
        System.out.println(sP.BuscarGenero(lista));
        
        
        
    }
    
}
