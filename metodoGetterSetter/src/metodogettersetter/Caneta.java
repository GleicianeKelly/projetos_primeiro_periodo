package metodogettersetter;
public class Caneta {
   public String modelo; 
   private float ponta;
   private String cor;
   private boolean tampada; 
   
   public Caneta(String m, float p, String c){
       this.modelo = m; 
       this.ponta = p; 
       this.cor = c;
       this.tampar();
   
   }
   public String getModelo(){
       return this.modelo;
   }
   public void setModelo(String m){
       this.modelo = m;
   }
   public float getPonta(){ 
       return this.ponta;
   }
   public void setPonta(float p){
       this.ponta = p;
   }
   public void tampar(){
       this.tampada = true;
   }
   public void destampar(){
       this.tampada = false;
   }
   
   
   public void status(){
       System.out.println("Sobre a caneta:");
       System.out.println("O modelo é: " + this.getModelo());
       System.out.println("A ponta: " + this.getPonta());
       System.out.println("Cor da caneta: " + this.cor);
       System.out.println("Está tampada? " + this.tampada);
   }  

    
}
