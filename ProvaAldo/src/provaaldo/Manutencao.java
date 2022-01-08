package provaaldo;
import java.util.Date;
public class Manutencao {
    
    
    private int idManutencao;
    private Date data;
    private String descricao;
    private char tipo;
    private int horasAbatidas;

    public Manutencao(int idManutencao, Date data, String descricao, char tipo, 
            int horasAbatidas) {
        this.idManutencao = idManutencao;
        this.data = data;
        this.descricao = descricao;
        this.tipo = tipo;
        this.horasAbatidas = horasAbatidas;
    }
    
    
    
    public int getIdManutencao() {
        return idManutencao;
    }

    

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getHorasAbatidas() {
        return horasAbatidas;
    }

    public void setHorasAbatidas(int horasAbatidas) {
        this.horasAbatidas = horasAbatidas;
    }
    
    
    
    
    
    
    
}
