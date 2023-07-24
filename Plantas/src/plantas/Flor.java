/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantas;

/**
 *
 * @author Mónica A
 */
public class Flor extends Planta {
    
    private String colorPetalos;
    private int cantidadPromedioPetalos;
    private String colorPistilos;
    private String variedad;
    private String estacion;

    public Flor() {
    }

    public Flor(String colorPetalos, int cantidadPromedioPetalos, String colorPistilos, String variedad, String estacion, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
        this.colorPistilos = colorPistilos;
        this.variedad = variedad;
        this.estacion = estacion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantidadPromedioPetalos() {
        return cantidadPromedioPetalos;
    }

    public void setCantidadPromedioPetalos(int cantidadPromedioPetalos) {
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
    }

    public String getColorPistilos() {
        return colorPistilos;
    }

    public void setColorPistilos(String colorPistilos) {
        this.colorPistilos = colorPistilos;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }
    
    
    
    
//Punto 3
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, Soy una flor");
         }
    
            
    
}
