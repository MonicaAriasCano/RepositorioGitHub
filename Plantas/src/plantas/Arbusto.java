
package plantas;


public class Arbusto extends Planta {
    
    private  double ancho;
    private boolean esDomestico;
    private String variedadarbusto;
    private String color;
    private boolean sePodaoNo;

    public Arbusto() {
    }

    public Arbusto(double ancho, boolean esDomestico, String variedadarbusto, String color, boolean sePodaoNo, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedadarbusto = variedadarbusto;
        this.color = color;
        this.sePodaoNo = sePodaoNo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadarbusto() {
        return variedadarbusto;
    }

    public void setVariedadarbusto(String variedadarbusto) {
        this.variedadarbusto = variedadarbusto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSePodaoNo() {
        return sePodaoNo;
    }

    public void setSePodaoNo(boolean sePodaoNo) {
        this.sePodaoNo = sePodaoNo;
    }
    
    
    
    
    
    //Punto 3
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, Soy un arbusto");
        
         }
    
}
