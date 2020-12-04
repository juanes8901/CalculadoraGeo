
package JECM_Controlador;

public class JECM_Esfera implements JECM_Figura{ //lineas punteadas implementa
    private double r;

    public JECM_Esfera(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obtenerarea() {
        return 4*Math.PI*Math.pow(getR(), 2);
    }

    @Override
    public double obtenerVolumen() {
        return (4*Math.PI*Math.pow(getR(), 3))/3;
    }
    
      @Override
    public String toString() {
        //return "EHEF_Cubo{" + "a=" + a + '}';
        return String.format("Esfera \n\tr.......%.2f"
                            +"\n\tÁrea....%.2f"
                            +"\n\tVolumen....%.2f", 
                            getR(), 
                            obtenerarea(),
                            obtenerVolumen());
    }
}
