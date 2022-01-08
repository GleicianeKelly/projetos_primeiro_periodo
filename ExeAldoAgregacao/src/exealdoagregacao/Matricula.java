package exealdoagregacao;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Matricula {
    
    private int id;
    private Date data;
    private Aluno aluno;
    private boolean efetivada = false;

    
    
    public Matricula(int id, Date data, Aluno aluno) {
        this.id = id;
        this.aluno = aluno;
        this.data = data;
        
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");  
        return "\nId matrícula: " + this.id + "\nDados aluno: " + 
                "\nData         : " + formatoData.format(this.data) +
                this.aluno + "\nStatus da matrícula: " + this.efetivada;
    }
    
    
    
    public int getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public boolean getEfetivada() {
        return efetivada;
    }

    public void setEfetivada(boolean efetivada) {
        this.efetivada = efetivada;
    }
    
    
    
    
    public void registrarMatricula(Turma turma){
        if(turma.getMatricula().size() < turma.getCapacidade()){
            turma.inserirMatricula(this);
            this.efetivada = true;
        }
        else{
            this.efetivada = false;
        }
    }
           
    
    
    
    
    
}
