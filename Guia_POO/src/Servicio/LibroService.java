/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LibroService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        // La idea es crear el objeto en esta clase y pasarlo a través del return
        
        Libro libroCompleto = new Libro();
        
        System.out.println("Ingrese el ISBN del libro: ");
        libroCompleto.setIsbn(read.nextInt());
        System.out.println("Ingrese el título del libro: ");
        libroCompleto.setTitulo(read.next());
        System.out.println("Ingrese el autor del libro: ");
        libroCompleto.setAutor(read.next());
        System.out.println("Ingrese el número de páginas del libro: ");
        libroCompleto.setNumpag(read.nextInt());
        
        return libroCompleto;
    }
    
    public void mostrarLibro(Libro libro){
        // La idea es mostrar los atributos del objeto a través de la clase servicio
        
        System.out.println("El ISBN del libro es: "+libro.getIsbn());
        System.out.println("El título del libro es: "+libro.getTitulo());
        System.out.println("El autor del libro: "+libro.getAutor());
        System.out.println("El número de páginas del libro: "+libro.getNumpag());
        
    }
}
