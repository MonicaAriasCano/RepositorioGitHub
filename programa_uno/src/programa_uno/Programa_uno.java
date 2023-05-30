/**
 * mi primer programa
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa_uno;

import java.util.Scanner;

/**
 *
 * @author Mónica Arias Cano
 * @fecha 12/07/2022
 * @ version 1.1
 */
public class Programa_uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crear la instancia del objeto scanner, llamada leer
         */
        
        Scanner leer = new Scanner(System.in);
        
        /**
         * Creacion de variables
         */
        char vocal;
        int num;
        float num_decimal;
        String palabra;
        
                
        System.out.println("HOLA MUNDO - soy Monica");
        
        System.out.println("ingrese una vocal: ");
        //guardar el dato ingresado en la variable vocal
        vocal = leer.nextLine().charAt(0);
        //System.out.println("Usted ingreso la vocal " + vocal);
        
        //Mnejo de condiciones anidadas
        /*if (vocal == 'a'){
            System.out.println("Primera vocal " + vocal);   
        }else if (vocal == 'e'){
            System.out.println("segunda vocal " + vocal);
        }else if (vocal == 'i'){
            System.out.println("Tercera vocal " + vocal);
        }else if (vocal == 'o'){
            System.out.println("Cuarta vocal " + vocal);
        }else if (vocal == 'u'){
            System.out.println("Quinta vocal " + vocal);
        }else{
            System.out.println("Usted ingreso " + vocal + ", y no es una vocal");
        }
        
        */
        
        //Manejo de casos Switch
        switch(vocal){
            case 'a': System.out.println("Primera vocal " + vocal);
            break;
            case 'e': System.out.println("Segunda vocal " + vocal);
            break;
            case 'i': System.out.println("Tercera vocal " + vocal);
            break;
            case 'o': System.out.println("Cuarta vocal " + vocal);
            break;
            case 'u': System.out.println("Quinta vocal " + vocal);
            break;
            default : System.out.println("Usted ingreso " + vocal + ", y no es una vocal");
        }
        
        
        /*
        if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u'){
            System.out.println("Usted ingreso la vocal " + vocal);
        }
        //Forma comprimida de desarrollar condicionales simples
        else{
            System.out.println("Usted ingreso " + vocal + ", y no es una vocal");
        }
        */
        
         
        
        /*
        if (vocal == 'a'){
            System.out.println("Usted ingreso la vocal " + vocal);
        }
        //Una de las formas para desarrollar condicionales simples
        if (vocal == 'e'){
            System.out.println("Usted ingreso la vocal " + vocal);
        }
        */
            
            
       
     
        
      /**
        System.out.println("ingrese un numero ");
        num = Integer.parseInt(leer.nextLine());
        System.out.println("Usted digito el numero " + num);
        
        System.out.println("ingrese un numero decimal: ");
        num_decimal = Float.parseFloat(leer.nextLine());
        System.out.println("Usted digito el numero decimal " + num_decimal);
        
        System.out.println("Ingrese una palabra o menmsaje: ");
        palabra = leer.nextLine();
        System.out.println("Usted digito: " + palabra);
        
    */ 
        
        
        
        
        
    }
    
}
