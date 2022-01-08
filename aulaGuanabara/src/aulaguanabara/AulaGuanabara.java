
package aulaguanabara;
public class AulaGuanabara {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "média";
        c1.cor = "Preta"; 
        c1.carga = 90; 
        c1.ponta = 0.7f; 
        c1.tampar();
        c1.status();
        c1.rabiscar();
    
    }
}
