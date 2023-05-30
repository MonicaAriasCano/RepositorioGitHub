package calculadoram;

import java.util.Scanner;

public class CalculadoraM {
    

public static void main(String[] args) {
    
      Scanner leer = new Scanner(System.in);
        char opcion;

        menu();
        opcion = leer.nextLine().charAt(0);

        while (opcion != '5') {
            if (opcion == '1') {
                suma();
            } else if (opcion == '2') {
                resta();
            } else if (opcion == '3') {
                multiplicacion();
            } else if (opcion == '4') {
                division();
            }

            menu();
            opcion = leer.nextLine().charAt(0);
        }

    }

public static void menu() {
        //Scanner leer = new Scanner(System.in);

        System.out.println("menu");
        System.out.println("1 suma ");
        System.out.println("2 resta ");
        System.out.println("3 multiplicacion ");
        System.out.println("4 division ");
        System.out.println("5 salir ");
        System.out.println("ingrese opcion");
    }

    public static void suma() {

        Scanner leer = new Scanner(System.in);
        int x;
        int y;
        int resultado;

        System.out.println("Ingrese primer numero ");
        x = leer.nextInt();
        System.out.println("Ingrese segundo numero ");
        y = leer.nextInt();

        resultado = x + y;
        System.out.println(" El resultado de la suma es:  " + resultado);

    }

    public static void resta() {
        Scanner leer = new Scanner(System.in);
        int x;
        int y;
        int resultado;

        System.out.println("Ingrese primer numero ");
        x = leer.nextInt();
        System.out.println("Ingrese segundo numero ");
        y = leer.nextInt();
        resultado = x - y;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void multiplicacion() {
        Scanner leer = new Scanner(System.in);
        int x;
        int y;
        int resultado;

        System.out.println("Ingrese primer numero ");
        x = leer.nextInt();
        System.out.println("Ingrese segundo numero ");
        y = leer.nextInt();
        resultado = x * y;
        System.out.println("El resultado de la multiplicacion es:  " + resultado);
    }

    public static void division() {
        Scanner leer = new Scanner(System.in);
        int x;
        int y;
        int resultado;

        System.out.println("Ingrese primer numero ");
        x = leer.nextInt();
        System.out.println("Ingrese segundo numero ");
        y = leer.nextInt();
        resultado = x / y;
        System.out.println("El resultado de la division es:  " + resultado);
    }
}

      
