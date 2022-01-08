package exealdoagregacao;
import java.util.List;
import java.util.ArrayList;
public class Turma {
    
    
    private int id;
    private String descricao;
    private int capacidade;
    private List<Matricula> matricula;

    public Turma(int id, String descricao, int capacidade, List<Matricula> matricula ) {
        this.id = id;
        this.descricao = descricao;
        this.capacidade = capacidade;
        this.matricula = new ArrayList<Matricula>();
    }

    @Override
    public String toString() {
        return "\nId turma: " + this.id + "\nDescrição: " + this.descricao +
                "\nCapacidade: " + this.capacidade + "\nMatrículas: " + 
                this.matricula;
    }

    
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Matricula> getMatricula() {
        return matricula;
    }

    public void setMatricula(List<Matricula> matricula) {
        this.matricula = matricula;
    }



    public void inserirMatricula(Matricula matricula){
        this.matricula.add(matricula);
    }
    
    public int obterQtdeAlunos(){
        return this.matricula.size();
    }
    
    
    
    
}
