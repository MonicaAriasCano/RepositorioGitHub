
package ejerciciopoo1per;

public class TestPersona {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona objPersona1 = new Persona();
        //System.out.println("Su nombre es: " + objPersona1.getNombre());
        objPersona1.imprimirPersona();
        objPersona1.setNombre("Diana");
      
        objPersona1.imprimirPersona();
        
        
        Persona objPersona2 = new Persona("Carolina", 24, 1.7, 'h');
       //System.out.println("Su nombre del objeto 2 es: " + ObjPersona2.getNombre());
        objPersona2.imprimirPersona();
        
        Persona objPersona3 = new Persona("Andres", 45, 1.67, 'm'); 
        objPersona3.imprimirPersona();
        
        
    }
    
}
