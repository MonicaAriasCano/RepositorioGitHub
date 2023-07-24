/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 *Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 *constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 *luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 *numero de páginas.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int numpag;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numpag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numpag = numpag;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumpag() {
        return numpag;
    }
    
}
