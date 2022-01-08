package aula11herança02;
public final class Bolsista extends Aluno {
    
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de: " + this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista. Pagamento realizado! ");
    }
    
    
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

  
    
}
