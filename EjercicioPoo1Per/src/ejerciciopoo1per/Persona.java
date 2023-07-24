package ejerciciopoo1per;

public class Persona {

    //Creación de atributos
    private String nombre;
    private int edad;
    private double estatura;
    private char sexo;

    //Constructor sin parametros
    public Persona() {
        this.nombre = "Mónica";
        this.edad = 25;
        this.estatura = 1.7;
        this.sexo = 'm';
    }

    //Constructor con parametros
    public Persona(String nombre, int edad, double estatura, char sexo) {

        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        //this.sexo = sexo;
        this.setSexo(sexo);

    }

    //Accesadores --> Ingresan al ultimo valor de la variable
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;

    }

    public double getEstatura() {
        return estatura;
    }

    public char getSexo() {
        return sexo;

    }
    
    //mutadores --> cambian los valores de la variables
    //Algunas veces también se usan como "reglas dec negocio", validaciones.
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    
    }
    
    public void setEdad(int edad)
    {
        this.edad = edad;
    
    }
    
    public void setEstatura(double estatura)
    {
        this.estatura = estatura;
    
    }
    
    public void setSexo(char sexo)
    {
        if ((sexo == 'm')|| (sexo == 'f')){
            this.sexo = sexo;
    
    }else{
            
            System.out.println("Formato de sexo no valido");
        
        }
        
    
    }

    //metodo "customer" para imprimir datos de la clase
    public void imprimirPersona() {
        
        System.out.println("******DATOS DE PERSONA*******");
        System.out.println("Su nombre es :" + this.getNombre());
        System.out.println("Su edad es :" + this.getEdad());
        System.out.println("Su estatura es :" + this.estatura);
        
        if (this.getSexo() == 'm') {
            System.out.println("Su sexo es masculino");

        } else if (this.getSexo() == 'f') {
            System.out.println("Su sexo es femenino");

        }else {
            System.out.println("Formato de sexo no era valido");
        
        }
        System.out.println("*********************");
        System.out.println("");

    }

    

    

}
