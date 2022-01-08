package aulaguanabara;
public class Caneta {
   public String modelo; 
   public String cor; 
   private float ponta; 
   private int carga; 
   protected boolean tampada;
    
    public void status(){
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("O modelo é: " + this.modelo);
        System.out.printf("A ponta é: %.1f \n", this.ponta);
        System.out.println("A carga está com: " + this.carga +"%");
        System.out.println("A caneta está tampada? " + this.tampada);
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não posso rabiscar!");
        }
        else{
            System.out.println("Posso rabiscar!");
        }
    }
    protected void tampar(){ 
        this.tampada = true;
    }
    protected void destampar(){ 
        this.tampada = false;
    }
}
