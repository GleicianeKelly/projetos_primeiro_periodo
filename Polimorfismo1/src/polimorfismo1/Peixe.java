package polimorfismo1;
public class Peixe extends Animal{
    
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha!");
    }
    
    
    
    @Override
    public void emitirSom() {
        System.out.println("Glub Glub");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    
    
    
    
}
