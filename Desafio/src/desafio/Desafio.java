/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

/**
 *
 * @author Nicolas Aguero
 */

/*
import entidad.Vehiculo;
import servicio.VehiculoServicio;
*/


import entidad.Figura;
import servicio.FiguraServicio;
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        VehiculoServicio vs = new VehiculoServicio();
        int metrosAuto = 0;
        int metrosMoto = 0;
        int metrosBici = 0;

        Vehiculo auto = vs.crearVehiculo();
        Vehiculo moto = vs.crearVehiculo();
        Vehiculo bici = vs.crearVehiculo();

        System.out.println(auto);
        System.out.println(moto);

        metrosAuto = vs.Moverse(auto) + vs.Frenar(auto);
        metrosMoto = vs.Moverse(moto) + vs.Frenar(moto); 
        metrosBici = vs.Moverse(bici) + vs.Frenar(bici);
        
        System.out.println(metrosAuto);
        System.out.println(metrosMoto);
        System.out.println(metrosBici);
       */
        
        FiguraServicio fs = new FiguraServicio();
        Figura figura1 = fs.crearFigura();
        Figura figura2 = fs.crearFigura();
        Figura figura3 = fs.crearFigura();
        Figura figura4 = fs.crearFigura();
        
        System.out.println("SE CALCULARA EL AREA DE LAS FIGURAS");

        fs.calcularArea(figura1);
        fs.calcularArea(figura2);
        fs.calcularArea(figura3);
        fs.calcularArea(figura4);
       
        System.out.println("SE CALCULARA EL PERIMETRO DE LAS FIGURAS");
        fs.calcularPerimetro(figura1);
        fs.calcularPerimetro(figura2);
        fs.calcularPerimetro(figura3);
        fs.calcularPerimetro(figura4);
       
    }

}
