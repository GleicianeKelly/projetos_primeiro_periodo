package polimorfismo1;
public class Reptil extends Animal {
    
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    
    
    
    
    
    
    
    
}
