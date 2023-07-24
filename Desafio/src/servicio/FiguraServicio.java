/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

/**
 *
 * @author Nicolas Aguero
 */

import entidad.Figura;
import java.util.Scanner;
public class FiguraServicio {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
   public Figura crearFigura(){
       Figura figura = new Figura();
       
       System.out.println("Ingrese el tipo de figura a crear (cuadrado,rectangulo,rombo,triangulo)");
       figura.setTipo(leer.next()); 
       return figura;
   }
   
   public void calcularArea(Figura figura){
       int area = 0;  
       switch(figura.getTipo()){
            case "cuadrado":
                System.out.println("Ingrese el lado del cuadrado");
                figura.setLado(leer.nextInt());
                area = figura.getLado() * figura.getLado();
                     System.out.println("El area del " + figura.getTipo() + " es " + area);
                break;
            case "rectangulo":
                  System.out.println("Ingrese la base del rectangulo");
                figura.setBase(leer.nextInt());
                System.out.println("Ingrese la altura del rectangulo");
                figura.setAltura(leer.nextInt());
                area = figura.getBase() * figura.getAltura();
                     System.out.println("El area del " + figura.getTipo() + " es " + area);
                break;
            case "rombo":
                  System.out.println("Ingrese la diagonal Mayor");
                figura.setDiagonalMayor(leer.nextInt());
                System.out.println("Ingrese la diagonal menor");
                figura.setDiagonalMenor(leer.nextInt());
                area = (figura.getDiagonalMayor() * figura.getDiagonalMenor()) / 2;
                     System.out.println("El area del " + figura.getTipo() + " es " + area);
                break;
            case "triangulo":
                  System.out.println("Ingrese la base del triangulo");
                figura.setBase(leer.nextInt());
                System.out.println("Ingrese la altura del triangulo");
                figura.setAltura(leer.nextInt());
                area = (figura.getBase() * figura.getAltura()) / 2;
                System.out.println("El area del " + figura.getTipo() + " es " + area);
                break;
        }
   }
   
   public void calcularPerimetro(Figura figura){
    int perimetro = 0;

    switch (figura.getTipo()){
             case "cuadrado":
                System.out.println("Ingrese el lado del cuadrado");
                figura.setLado(leer.nextInt());
                perimetro = 4 * figura.getLado();
                     System.out.println("El perimetro del " + figura.getTipo() + " es " + perimetro);
                break;
            case "rectangulo":
                  System.out.println("Ingrese el lado del rectangulo");
                figura.setLado(leer.nextInt());
                System.out.println("Ingrese la altura del rectangulo");
                perimetro = (figura.getBase() * 2) + (figura.getAltura() * 2);
                    System.out.println("El perimetro del " + figura.getTipo() + " es " + perimetro);
                break;
            case "rombo":
                  System.out.println("Ingrese el lado del rombo");
                figura.setLado(leer.nextInt());
             
                perimetro = figura.getLado() * 4;
                       System.out.println("El perimetro del " + figura.getTipo() + " es " + perimetro);
                break;
            case "triangulo":
                 System.out.println("Ingrese el lado 1 del triangulo");
                 figura.setLado(leer.nextInt());
                System.out.println("Ingrese el lado 2 del triangulo");
                figura.setLado2(leer.nextInt());
                System.out.println("Ingrese el lado 3 del triangulo");
                figura.setLado3(leer.nextInt());
                perimetro = figura.getLado() + figura.getLado2() + figura.getLado3();
                System.out.println("El perimetro del " + figura.getTipo() + " es " + perimetro);
                break;
        }
    }
}
   


