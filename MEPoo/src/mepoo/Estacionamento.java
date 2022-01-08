package mepoo;
public class Estacionamento {
    
    private int codigo;
    private String nome;
    private String cidade;
    private int qtdVagas;
    private String situacao = "Desativado";
    private int horasFranquiaInicial;
    private float valorFranquiaInicial;
    private float valorAdicionalHora;

    /*@Override
    public String toString() {
        return "\nCodigo: " + this.codigo + "\nNome: " + this.nome + 
                "\nCidade: " + this.cidade;
    }*/

    @Override
    public String toString() {
        return "\nCódigo:  " + this.codigo + "\nNome: " + this.nome + 
                "\nCidade: " + this.cidade  + "\nQuantidade de vagas: " + 
                this.qtdVagas + " vagas" + "\nQuantidade de horas " + 
                "da franquia inicial: " + this.horasFranquiaInicial + " horas " 
                + "\nValor " + "da franquia inicial: R$"  + 
                this.valorFranquiaInicial + "\nValor " + 
                "adicional por hora R$" + this.valorAdicionalHora;
    }

    public Estacionamento(int codigo, String nome, String cidade, int qtdVagas, int horasFranquiaInicial, float valorFranquiaInicial, float valorAdicionalHora) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
        this.qtdVagas = qtdVagas;
        this.horasFranquiaInicial = horasFranquiaInicial;
        this.valorFranquiaInicial = valorFranquiaInicial;
        this.valorAdicionalHora = valorAdicionalHora;
    }

    
    
    
    
    /*public Estacionamento(int codigo, String nome, String cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
        
    }*/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getHorasFranquiaInicial() {
        return horasFranquiaInicial;
    }

    public void setHorasFranquiaInicial(int horasFranquiaInicial) {
        this.horasFranquiaInicial = horasFranquiaInicial;
    }

    public float getValorFranquiaInicial() {
        return valorFranquiaInicial;
    }

    public void setValorFranquiaInicial(float valorFranquiaInicial) {
        this.valorFranquiaInicial = valorFranquiaInicial;
    }

    public float getValorAdicionalHora() {
        return valorAdicionalHora;
    }

    public void setValorAdicionalHora(float valorAdicionalHora) {
        this.valorAdicionalHora = valorAdicionalHora;
    }
    
    
    
    public void ativar(){
        if(this.situacao == "desativado"){
            this.setSituacao("ativado");
            
        }
        
    }
    
    public void desativar(){
        if(this.situacao == "ativado"){
            this.setSituacao("desativado");
            
        }
    }
    
     public void status(){
            System.out.println("Código: " + this.getNome());
            System.out.println("Nome: " + this.getCidade());
            System.out.println("Cidade: " + this.getCidade());
    }
    
    
    
}
