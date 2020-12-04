
package JECM_Controlador;

public class JECM_PruebaFigurasGeometricas {
    public static void main(String[] args) {
        JECM_Cubo rubick = new JECM_Cubo(5);
        System.out.println(rubick);
        
        JECM_Paralelepipedo tabique = new JECM_Paralelepipedo(15, 25, 10);
        System.out.println(tabique);
        
        JECM_Esfera pelota = new JECM_Esfera(2);
        System.out.println(pelota);
        
        JECM_Cilindro rotoplas = new JECM_Cilindro(.80, 1.5);
        System.out.println(rotoplas);
        
        JECM_Cono barquillo = new JECM_Cono(3, 7, 2);
        System.out.println(barquillo);
    }
}
