package pkg5b;
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo; 
    private boolean status; 
    
    public void estadoAtual(){
        System.out.println("--------------------------------------");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
        
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if ("cc".equals(this.getTipo())) {
            this.setSaldo(50);
        } else {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(float saldo){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro ");
        }
        else if(this.getSaldo() < 0){
        System.out.println("conta com débito");
        }
        else{
            this.setStatus(false);
            System.out.println("Pode fechar conta ");
        }
        
    }
    public void depositar(float valor){
        if(this.status == true){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de: "  + this.getDono());
        }
        else{
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float valor){
        if(this.status == true){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!");
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Impossível sacar! ");
        }
    }
    public void pagarMensal(){
        float v = 0;
        if("cc".equals(this.getTipo())){
           v = 12; 
        }
        else{
            v = 20;
        }
        if(this.status == true){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        }
        else{
            System.out.println("Impossível pagar com conta fechada");
        }
    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private void setTipo(int tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void fecharConta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
