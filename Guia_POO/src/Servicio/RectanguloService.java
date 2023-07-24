/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RectanguloService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo(){
        System.out.print("Ingrese el valor de la base: ");
        int base = read.nextInt();
        System.out.print("Ingrese el valor de la altura: ");
        int altura = read.nextInt();
        Rectangulo r = new Rectangulo(base,altura);
        return r;
    }
    
    public void mostrarRectangulo(Rectangulo rec){
        System.out.println("El área del rectángulo es: " + rec.area());
        System.out.println("El perímetro del rectángulo es: " + rec.perim());
        for (int i = 0; i < rec.getAltura(); i++) {
            for (int j = 0; j < rec.getBase(); j++) {
                if(j == 0 || j == rec.getAltura()-1 || i == 0 || i == rec.getAltura()-1){
                    System.out.print("* ");
                }else{
                    System.out.print("        ");
                }
            }
            System.out.println("");
        }
    }
}
