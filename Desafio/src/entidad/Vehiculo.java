/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Nicolas Aguero
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int año, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Soy un/una: " + tipo;
    }
    
    
    
    
    
    
}
