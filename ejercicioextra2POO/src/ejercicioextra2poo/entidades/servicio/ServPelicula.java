/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2poo.entidades.servicio;

import ejercicioextra2poo.entidades.Pelicula;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author copec
 */
public class ServPelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Pelicula CrearPelicula(){
    Pelicula p = new Pelicula();
        System.out.print("Ingrese titulo de la pelicula");
        p.setTitulo(leer.next());
        System.out.print("Ingrese genero");
        p.setGenero(leer.next());
        System.out.print("Ingrese año");
        p.setAnio(leer.nextInt());
        System.out.print("Ingrese duracion");
        p.setDuracion(leer.nextInt());
        return p;

    }
    
    public String BuscarPelicula(List<Pelicula> lista) {
        String existe = "";
        System.out.println("Ingrese el nombre de la pelicula a buscar");
        String busqueda = leer.next();
        for (Pelicula p : lista) {
            if (p.getTitulo().equalsIgnoreCase(busqueda)) {
                existe = "Esta pelicula esta disponible";
            } 

        }
        if (existe.equalsIgnoreCase("")){
                existe = "la pelicula no esta disponible en el catalogo";  
            }
        return existe;
    }
    public String BuscarGenero(List<Pelicula> lista) {
        String existe = "";
        System.out.println("Ingrese el genero de la pelicula");
        String busqueda = leer.next();
        for (Pelicula p : lista) {
            if (p.getGenero().equalsIgnoreCase(busqueda)) {
                existe = existe.concat(p.getTitulo());
                existe = existe.concat(" ");
        }
            }
        if (existe.equalsIgnoreCase("")){
                existe = "No hay peliculas de este genero";  
            }
        return existe;
    }
    
    
    
}
