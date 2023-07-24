/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2poo.entidades;

import java.util.Date;

/**
 *
 * @author copec
 */
public class Alquiler {
    private String nombrePelicula;
    private Date fInicio;
    private Date fFin;
    private float precio;

    public Alquiler() {
    }

    public Alquiler(String nombrePelicula, Date fInicio, Date fFin, float precio) {
        this.nombrePelicula = nombrePelicula;
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.precio = precio;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public Date getfInicio() {
        return fInicio;
    }

    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }

    public Date getfFin() {
        return fFin;
    }

    public void setfFin(Date fFin) {
        this.fFin = fFin;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
