package polimorfismo1;
public class Polimorfismo1 {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        
        m.setPeso(1.5f);
        m.setIdade(2);
        m.setMembros(4);
        System.out.println("O animal é um mamífero!");
        System.out.println(m.toString());
        System.out.println("O mamífero fica:");
        m.alimentar();
        
        System.out.println("-------------------------");
        
        Reptil r = new Reptil();
        r.setPeso(12f);
        r.setIdade(3);
        r.setMembros(4);
        System.out.println("O animal é um reptil!");
        System.out.println(r.toString());
        
        System.out.println("-------------------------");
        
        Peixe p = new Peixe();
        p.setPeso(4.5f);
        p.setIdade(6);
        p.setMembros(2);
        System.out.println("O animal é um peixe!");
        System.out.println(p.toString());
        
        System.out.println("-------------------------");
        
        
        Cachorro c = new Cachorro();
        c.locomover();
        c.emitirSom();
    }
    
}
