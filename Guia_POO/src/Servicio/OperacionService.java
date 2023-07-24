/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operaciones;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OperacionService {
    private Scanner read = new Scanner(System.in);
    
    public Operaciones crearOperacion(){
        System.out.print("Ingrese el primer número: ");
        int num1 = read.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = read.nextInt();
        Operaciones op = new Operaciones(num1, num2);
        return op;
    }
    
    public void sumando(Operaciones op){
        System.out.println("La suma de ambos números es: " + op.suma());
    }
    
    public void restando(Operaciones op){
        System.out.println("La resta de ambos números es: " + op.resta());
    }
    
    public void multiplicando(Operaciones op){
        if(op.multiplicacion() == 0){
            System.out.println("La multiplicación no se realizó porque uno de los dos números es igual a cero");
        }else{
            System.out.println("La multiplicación entre ambos números es: " + op.multiplicacion());
        }
    }
    
    public void dividiendo(Operaciones op){
        if(op.division() == 0){
            System.out.println("La división no se realizó porque uno de los dos números es igual a cero");
        }else{
            System.out.println("La división entre ambos números es: " + op.division());
        }
    }
}
