package aulaaldosabado;
public class Imovel {
    
    
    private int idImovel;
    private String tipo;
    private int leituraAnterior;
    private int leituraAtual;
    private int consumo;
    private double valorConta;

    
    public void status(){
        System.out.println("Id imovel: " + this.getIdImovel());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Leitura atual: " + this.getLeituraAtual());
        System.out.println("Consumo: " + this.getConsumo());
    }
    
    
    
    public Imovel(int idImovel, String tipo, int leitura, double valorConta) {
        this.idImovel = idImovel;
        this.tipo = tipo;
        this.leituraAtual = leitura;
        this.leituraAnterior = leitura;
        this.consumo = 0;
        this.valorConta = valorConta;
    }

    public int getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(int idImovel) {
        this.idImovel = idImovel;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(int leituraAnterior) {
        this.leituraAnterior = leituraAtual;
    }

    public int getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(int leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }
    
    
    public void registrarLeitura(int leitura){
        this.setLeituraAnterior(this.getLeituraAtual());
        this.setLeituraAtual(leitura);
        this.setConsumo(this.getLeituraAnterior() - leitura);
    }
    
    public void calcularConta(){
        float valorConta = 0;
        if(this.tipo.equalsIgnoreCase("c")){
            valorConta = this.getConsumo()*0.7f;
        }
        else if(this.tipo.equalsIgnoreCase("i")){
            valorConta = this.getConsumo()*0.4f;
        }
        else{
            valorConta = this.getConsumo()*0.5f;
        }
    }
    
    
    
}
