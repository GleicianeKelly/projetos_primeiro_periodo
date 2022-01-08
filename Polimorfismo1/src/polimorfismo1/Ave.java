package polimorfismo1;
public class Ave extends Animal{
    
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    public void fazerNinho(){
        System.out.println("Constriu um ninho!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Faz piu piu");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    
    
    
    
}
