package provaaldo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Maquina {
    
    
    private int idMaquina;
    private String descricao;
    private int horasParaManutencao;
    private int horasTrabalho;
    private List<Manutencao> manutencao;

  
    public Maquina(int idMaquina, String descricao, int horasParaManutencao){
        this.idMaquina = idMaquina;
        this.descricao = descricao;
        this.horasParaManutencao = horasParaManutencao;
        this.manutencao = new ArrayList<Manutencao>();
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        
        String status = "\nId: " + this.idMaquina +
                "\nDescrição: " + this.descricao +
                "\nHoras para manutenção: " + this.horasParaManutencao + 
                "\nHoras de trabalho: " + this.horasTrabalho +
                "\nManutenções registradas: "; 
        
        if(this.manutencao.isEmpty()){
            status += "Não existe manutenção registrada!";
        }
        
        else{
            for(Manutencao manutencao : this.manutencao){
                status += "\nId da manutenção: " + manutencao.getIdManutencao()+
                        "\nDescrição: " + manutencao.getDescricao() + 
                        "\nData: " + manutencao.getData() + 
                        "\nTipo: " + manutencao.getTipo() + 
                        "\nHoras abatidas " + manutencao.getHorasAbatidas();
            }
        }
        return status;
    }
    
    
    
    
    

    public int getIdMaquina() {
        return idMaquina;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getHorasParaManutencao() {
        return horasParaManutencao;
    }

    public void setHorasParaManutencao(int horasParaManutencao) {
        this.horasParaManutencao = horasParaManutencao;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public List<Manutencao> getManutencao() {
        return manutencao;
    }

    public void setManutencao(List<Manutencao> manutencao) {
        this.manutencao = manutencao;
    }
    
    
    public void registrarManutencao(Manutencao manutencao){
        
        this.manutencao.add(manutencao);
        
        String tipoP = "P";
        
        if(manutencao.getTipo() == tipoP.charAt(0)){
            for(Manutencao manut : this.manutencao){
               this.setHorasParaManutencao(this.horasParaManutencao - manut.getHorasAbatidas());
               this.setHorasTrabalho(0);
            }
        }
        else{
            for(Manutencao manut : this.manutencao){
               this.setHorasTrabalho(this.getHorasTrabalho() - manut.getHorasAbatidas());
            }
        }
        
    }
    
    public void registrarProducao(Producao producao){
       
        this.horasTrabalho += producao.getQtdeHoras();
    }
    
     
    
    

    
    
    
    
    
    
    
    
    
}
