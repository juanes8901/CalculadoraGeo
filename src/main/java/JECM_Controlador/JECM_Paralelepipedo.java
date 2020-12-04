
package JECM_Controlador;

//ELEUTERIO HERNÁNDEZ EDUARDO 29/02/2020
public class JECM_Paralelepipedo extends JECM_Cubo{
    private double b;
    private double h;

    public JECM_Paralelepipedo(double a, double b, double h ) {
        super(a);
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double obtenerVolumen() {
        //return super.obtenerVolumen(); //To change body of generated methods, choose Tools | Templates.
        return getA()*getB()*getH();
    }

    @Override
    public double obtenerarea() {
        //return super.obtenerarea(); //To change body of generated methods, choose Tools | Templates.
        return 2*(getA()*getB()+getB()*getH()+getA()*getH());
    }
    
     @Override
    public String toString() {
        //return "EHEF_Cubo{" + "a=" + a + '}';
        return String.format("Paralelepipedo " 
                            +"\n\ta.......%.2f"
                            +"\n\tb.......%.2f"
                            +"\n\th.......%.2f"
                            +"\n\tÁrea....%.2f"
                            +"\n\tVolumen....%.2f", 
                            getA(),
                            getB(),
                            getH(),
                            obtenerarea(),
                            obtenerVolumen());
    }
    
}
