package exercicioaldo;
public class BulkCarrirer extends Navio  {

    
    
    private int quantidadeGuindastes;
    private int quantidadeCamadas;

    @Override
    public void status() {
        super.status(); 
        System.out.println("Quantidade de guindastes: " + this.getQuantidadeGuindastes());
        System.out.println("Quantidade de camadas: " + this.getQuantidadeCamadas());
    }

    
    
    public BulkCarrirer(int id, String nome, int quantidadePoroes, 
            float capacidadeCarga, int quantidadeGuindastes,
            int quantidadeCamadas) {
        super(id, nome, quantidadePoroes, capacidadeCarga);
        this.quantidadeGuindastes = quantidadeGuindastes;
        this.quantidadeCamadas = quantidadeCamadas;
    }

  
    public int getQuantidadeGuindastes() {
        return quantidadeGuindastes;
    }

    public void setQuantidadeGuindastes(int quantidadeGuindastes) {
        this.quantidadeGuindastes = quantidadeGuindastes;
    }

    public int getQuantidadeCamadas() {
        return quantidadeCamadas;
    }

    public void setQuantidadeCamadas(int quantidadeCamadas) {
        this.quantidadeCamadas = quantidadeCamadas;
    }

    
    
    
    @Override
    public void iniciaCarregamento() {
        super.iniciaCarregamento();
    }

    @Override
    public void bloqueiaCarregamento() {
       super.bloqueiaCarregamento();
    }

    
   
    
    
    
    
    
    
}
