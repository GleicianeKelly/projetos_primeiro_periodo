
package aulaguanabara;
public class AulaGuanabara {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "média";
        c1.cor = "Preta"; 
        c1.tampada = true;
        c1.status();
        c1.rabiscar();
        
        System.out.println("------------------");
        
        Caneta c2 = new Caneta();
        c2.modelo = "Bic cristal";
        c2.cor = "rosa";
        c2.tampada = false;
        c2.status();
        c2.rabiscar();
    
    }
}
