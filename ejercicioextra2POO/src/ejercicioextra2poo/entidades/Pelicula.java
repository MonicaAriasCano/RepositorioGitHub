/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2poo.entidades;

/**
 *
 * @author copec
 */
public class Pelicula {
    private String titulo;
    private String genero;
    private int anio;
    private int duracion;
    private int codigo;
    

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int anio, int duracion, int codigo) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", anio=" + anio + ", duracion=" + duracion + ", codigo=" + codigo + '}';
    }
    
    
    
    
    
}
