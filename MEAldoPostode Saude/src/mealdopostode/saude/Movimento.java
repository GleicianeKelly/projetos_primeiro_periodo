package mealdopostode.saude;
import java.util.Date;
public class Movimento {
    
    
    static int contador = 0;
    private int idMovimento;
    private Date data;
    private Character tipoMovimento;
    private Vacina vacina;
    private int quantidade;
    private float valorRepasse;

    
    
    public Movimento(Vacina vacina, Date data, Character tipoMovimento, int quantidade){
             
        this.idMovimento = contador++;
        this.data = data;
        this.tipoMovimento = tipoMovimento;
        this.vacina = vacina;
        this.quantidade = quantidade;
        this.valorRepasse = valorRepasse;
    }
    
    
    
    
    public int getIdMovimento() {
        return idMovimento;
    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public char getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(Character tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorRepasse() {
        return valorRepasse;
    }

    public void setValorRepasse(float valorRepasse) {
        this.valorRepasse = valorRepasse;
    }
    
    
    public double calculaRepasse(){
       
        double repasse = 0f;
        if(this.tipoMovimento.equals('A') || this.tipoMovimento.equals('a')){
            
            if(vacina.getTipo().equals('N') || vacina.getTipo().equals('n')){
                repasse = (this.quantidade / 100) * 30;
            }
            
            else if(vacina.getTipo().equals('E') || vacina.getTipo().equals('e')){
                repasse = (this.quantidade / 100) * 40;
            }
            
        }
        
        
        return repasse;
        
        }
    
    
    @Override
    public String toString() {
        return "\nMovimento: " + idMovimento + "\nData: " + data + 
                "\ntipo Movimento:" + tipoMovimento + "\nvacina: " + vacina + 
                "\nQuantidade=" + quantidade + "\nValor Repasse: " + valorRepasse;
    }

    
}
