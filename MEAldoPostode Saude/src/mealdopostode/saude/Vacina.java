package mealdopostode.saude;
public class Vacina {
    
    
    
    private int idVacina;
    private String descricao;
    private Character tipo;

    
    
    
    public Vacina(int idVacina, String descricao, Character tipo) {
        this.idVacina = idVacina;
        this.descricao = descricao;
        this.tipo = tipo;
    }
    
    
    

    public int getIdVacina() {
        return idVacina;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
