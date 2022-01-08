package polimorfismo2;
public class Mamifero extends Animal {

    
    private String corPelo;

    @Override
    public String toString() {
        return "Mamifero{" + "corPelo=" + corPelo + '}';
    }
    
    
    
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }


    
    
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
