package polimorfismo2;
public class Polimorfismo2 {
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        
        c.emitirSom();
        c.reagir(false);
        c.reagir(12, 30);
        c.reagir("Olá");
        c.reagir(4, 11);
        c.setCorPelo("Rosa");
        System.out.println(c.toString());
    }
    
}
