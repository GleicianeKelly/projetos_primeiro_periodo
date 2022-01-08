package exercício.aula.pkg5;
public class ContaBanco {
    
  public  int numConta;
  protected String tipo;
  private String dono; 
  private float saldo; 
  private boolean status;
  
  
  public ContaBanco(){
      saldo = 0;
      status = false;
  }
  public void setNumConta(int n){
      numConta = n;
  }
  public int getNumConta(){
      return numConta;
  }
  public void setTipo(String t){
      tipo = p;
  }
  public String getTipo(){
      return tipo;
  }
  public void setDono(String d){
      dono = d;
  }
  public String getDono(){
      return dono;
  }
  public void setSaldo(float s){
      saldo = s;
  }
  public float getSaldo(){
      return saldo;
  }
  public void setStatus(boolean st){
      status = st;
  }
  public boolean getStatus(){
      return status;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  /*public String getAbrirConta(){
      String mens = "";
      if(tipo.equalsIgnoreCase("cc")){
          mens = "Recebeu 50.00";
      }
      else{
          mens = "Recebeu 150.00";
      }
      return mens;
  }
  public String getFecharConta(){
      String mens2 = ""; 
      if(saldo > 0 || saldo < 1){
          mens2 = "Saldo devedor"; 
      }
      return mens2;
  }
  public String getDepositar(){
      String mens3 = "";
      if(status == true){
          mens3 = "Pode depositar"; 
      }
      return mens3; 
  }
  public String  getSacar(){
      String mens4 = "";
      if(status == true){
          if(saldo > 0){
              mens4 = "Pode sacar! ";
          }
      }
      return mens4;
  }
  public String getPagarMensal(){
      String mens5 = "";
      if(tipo.equalsIgnoreCase("cc")){
          mens5 = "Paga 12.00"; 
      }
      else{
          mens5 = "Paga 20.00";
      }
      return mens5;
  }
  public void podedepositar(){
      this.status = true; 
  }
  public void naoPodeDepositar(){
      this.status = false; 
  }//*
}
