package mealdopostode.saude;
import java.util.List;
import java.util.ArrayList;
public class Posto {
    
    private int idPosto;
    private String nome;
    private List<Movimento> movimento;

    @Override
    public String toString() {
        String status = "\nId Posto" + this.getIdPosto() + "\nNome do posto" + 
                this.getNome() + "\nMovimentos registrados: ";
        
        
        if(this.movimento.isEmpty()){
            status += "Não existe movimento registrado! ";
        }
        
        else{
            for(Movimento movimento : this.movimento){
                
                status += "\nId de vacina: " + movimento.getVacina().getIdVacina() +
                        "\nDescrição: " + movimento.getVacina().getDescricao() + 
                        "\nTipo: " + movimento.getVacina().getTipo(); 
                        
            }
        }
        
        
        return status;
    }

    
    
    public Posto(int idPosto, String nome) {
        this.idPosto = idPosto;
        this.nome = nome;
        this.movimento = new ArrayList<Movimento>();
    }

    

    public int getIdPosto() {
        return idPosto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Movimento> getMovimento() {
        return movimento;
    }

    public void setMovimento(List<Movimento> movimento) {
        this.movimento = movimento;
    }


    
    public void registraMovimento(Movimento movimento){
        this.movimento.add(movimento);
    }

    public int obtemEstoque(Vacina vacina){
        
        int entrada = 0;
        int saida = 0;
        int estoque = 0;
        
        
        for(Movimento movimento: movimento){
            if(movimento.getVacina() == vacina){
                
                if(movimento.getTipoMovimento().equals('E') || movimento.getTipoMovimento().equals('e')){
                    entrada = movimento.getQuantidade();
                }
                
                if(movimento.getTipoMovimento().equals('A') || movimento.getTipoMovimento().equals('a')){
                    saida = movimento.getQuantidade();
                }
                
                if(saida > entrada){
                    estoque = 0;
                }
                
                estoque = entrada - saida;
            }
            
        }
        
        return estoque;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
