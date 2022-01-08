package provaaldo;
import java.util.Date;
public class Producao {
    
    private int idProducao;
    private Date data;
    private Maquina maquina;
    private int qtdeHoras;

    public Producao(int idProducao, Date data, Maquina maquina, int qtdeHoras) {
        this.idProducao = idProducao;
        this.data = data;
        this.maquina = maquina;
        this.qtdeHoras = qtdeHoras;
    }
    
    

    public int getIdProducao() {
        return idProducao;
    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }
    
    
    
    
    
    
    
    
    
    
}
