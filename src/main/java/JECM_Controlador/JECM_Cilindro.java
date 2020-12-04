
package JECM_Controlador;

public class JECM_Cilindro extends JECM_Esfera{
    private double h;

    public JECM_Cilindro( double r, double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double obtenerVolumen() {
        return Math.PI*Math.pow(getR(), 2)*getH();
    }

    @Override
    public double obtenerarea() {
        return (2*Math.PI*getR()*getH())+(2*Math.PI*Math.pow(getR(), 2));
    }
    
          @Override
    public String toString() {
        //return "EHEF_Cubo{" + "a=" + a + '}';
        return String.format("Cilindro \n\tr.......%.2f"
                            +"\n\th.......%.2f"
                            +"\n\tÁrea....%.2f"
                            +"\n\tVolumen....%.2f", 
                            getR(),
                            getH(),
                            obtenerarea(),
                            obtenerVolumen());   
    }
}