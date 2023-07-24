/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantas;

/**
 *
 * @author Mónica A
 */
public class Arbol extends Planta{
    
    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String TipoHojas;

    public Arbol() {
    }

    public Arbol(String variedad, String tipoTronco, double radioTronco, String color, String TipoHojas, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.TipoHojas = TipoHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHojas() {
        return TipoHojas;
    }

    public void setTipoHojas(String TipoHojas) {
        this.TipoHojas = TipoHojas;
    }
    
    
    //Punto 3

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un árbol");
   
    }
    
}
