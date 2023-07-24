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
public class Figura {
    
    private String tipo;
    private int lado;
    private int lado2;
    private int lado3;
    private int base;
    private int altura;
    private int diagonalMenor;
    private int diagonalMayor;

    public Figura(String tipo, int lado, int base, int altura, int diagonalMenor, int diagonalMayor) {
        this.tipo = tipo;
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.diagonalMenor = diagonalMenor;
        this.diagonalMayor = diagonalMayor;
    }

    public Figura() {
    }
    

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }


    
    
    
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setDiagonalMayor(int diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public void setDiagonalMenor(int diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public int getDiagonalMayor() {
        return diagonalMayor;
    }

    public int getDiagonalMenor() {
        return diagonalMenor;
    }

    public int getLado() {
        return lado;
    }

    public String getTipo() {
        return tipo;
    }
    
    
   
}
