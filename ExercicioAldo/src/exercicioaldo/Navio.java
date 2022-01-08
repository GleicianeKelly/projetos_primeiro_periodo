package exercicioaldo;
public abstract class Navio {
    
    private int id;
    private String nome;
    private int quantidadePoroes;
    private float capacidadeCarga;
    private String disponibilidade; 

    public void status(){
        System.out.println("--------------------------------------");
        System.out.println("Id: " + this.getId());
        System.out.println("Nome do navio: " + this.getNome());
        System.out.println("Quantidade porões: " + this.getQuantidadePoroes());
        System.out.println("Capacidade de carga: " + this.getCapacidadeCarga());
       
        
    }
    
    public void iniciaCarregamento(){
        this.disponibilidade = "Disponível";
    }
    public void bloqueiaCarregamento(){
        this.disponibilidade = "Lotado";
    }
    
    public Navio(int id, String nome, int quantidadePoroes, float capacidadeCarga) {
        this.id = id;
        this.nome = nome;
        this.quantidadePoroes = quantidadePoroes;
        this.capacidadeCarga = capacidadeCarga;
        this.disponibilidade = "Vazio";
        
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadePoroes() {
        return quantidadePoroes;
    }

    public void setQuantidadePoroes(int quantidadePoroes) {
        this.quantidadePoroes = quantidadePoroes;
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

   
    
    
    
    
    
    
}
