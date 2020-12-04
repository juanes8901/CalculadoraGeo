//se crea como java class porque será un método
package JECM_Controlador;
//en diagrama UML la linea está punteada y significa IMPLEMENTAR

public class JECM_Cubo implements JECM_Figura{ 
    private double a; //atributo
    
    //constructor. insert code.. constructor..

    public JECM_Cubo(double a) {
        this.a = a;
    }
    //get set

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    //metodos
    @Override
    public double obtenerarea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 6*Math.pow(getA(), 2);//nos eleva al, cuadrado
    }

    @Override
    public double obtenerVolumen() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Math.pow(getA(), 3);//eleva al cubo
    }
    
//to stribg

    @Override
    public String toString() {
        //return "EHEF_Cubo{" + "a=" + a + '}';
        return String.format("Cubo \n\ta.......%.2f"+"\n\tÁrea....%.2f"+"\n\tVolumen....%.2f", getA(), obtenerarea(),obtenerVolumen());
    }
    
}
