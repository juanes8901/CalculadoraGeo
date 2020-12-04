
package JECM_Controlador;

public class JECM_Cono extends JECM_Cilindro{
    private double g;

    public JECM_Cono(double r, double h, double g) {
        super(r, h);
        this.g = g;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    @Override
    public double obtenerarea() {
        return (Math.PI*getR()*getG())*(Math.PI*Math.pow(getR(), 2));
    }

    @Override
    public double obtenerVolumen() {
        return ((Math.PI*Math.pow(getR(), 2))*getH())/3;
    }
    
        @Override
    public String toString() {
        //return "EHEF_Cubo{" + "a=" + a + '}';
        return String.format("Cono \n\tr.......%.2f"
                            +"\n\th.......%.2f"
                            +"\n\tg.......%.2f"
                            +"\n\tÁrea....%.2f"
                            +"\n\tVolumen....%.2f", 
                            getR(), 
                            getH(),
                            getG(),
                            obtenerarea(),
                            obtenerVolumen());
    }
}
