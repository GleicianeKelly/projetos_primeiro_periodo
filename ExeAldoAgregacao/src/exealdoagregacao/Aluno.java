package exealdoagregacao;
public class Aluno {
    
    
    
    private int id;
    private String nome;

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nId aluno: " + this.id + "\nNome aluno: " + this.nome;
    }
    
    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
    
    
}
