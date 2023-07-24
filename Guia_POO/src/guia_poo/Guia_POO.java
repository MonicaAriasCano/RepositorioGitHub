/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo;

import Entidad.Circunferencia;
import Entidad.Libro;
import Entidad.Operaciones;
import Entidad.Persona;
import Entidad.Rectangulo;
import Servicio.CircunferenciaService;
import Servicio.LibroService;
import Servicio.OperacionService;
import Servicio.PersonaService;
import Servicio.RectanguloService;

/**
 *
 * @author Usuario
 */
public class Guia_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // El objeto que usa el servicio para crear una persona es perServ
        /*PersonaService perServ = new PersonaService();
        // Usando el retorno del servicio lo alojamos en la instancia de la persona
        Persona per = perServ.crearPersona();
        // Usando el servicio accedemos al get para mostrar el nombre
        perServ.mostrarPersona(per);
        LibroService libServ = new LibroService();
        Libro lib, lib1, lib2;
        lib = libServ.crearLibro();
        libServ.mostrarLibro(lib);
        lib1 = libServ.crearLibro();
        libServ.mostrarLibro(lib1);
        lib2 = libServ.crearLibro();
        libServ.mostrarLibro(lib2);
        CircunferenciaService cs = new CircunferenciaService();
        Circunferencia c, d, e;
        c = cs.crearCircunferencia();
        cs.mostrarCircunferencia(c);
        e = cs.crearCircunferencia();
        cs.mostrarCircunferencia(e);
        d = cs.crearCircunferencia();
        cs.mostrarCircunferencia(d);
        OperacionService os = new OperacionService();
        Operaciones s, p, q;
        s = os.crearOperacion();
        os.sumando(s);
        p = os.crearOperacion();
        os.multiplicando(p);
        q = os.crearOperacion();
        os.restando(q);
        */
        RectanguloService crerec = new RectanguloService();
        Rectangulo R,R2;
        R = crerec.crearRectangulo();
        
        R2 = crerec.crearRectangulo();
        System.out.println("");
        crerec.mostrarRectangulo(R);
        crerec.mostrarRectangulo(R2);
    }
    
}
