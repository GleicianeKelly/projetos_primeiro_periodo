package aulaguanabara;
public class Caneta {
    String modelo; 
    String cor; 
    float ponta; 
    int carga; 
    boolean tampada;
    
    void status(){
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("O modelo é: " + this.modelo);
        System.out.printf("A ponta é: %.1f \n", this.ponta);
        System.out.println("A carga está com: " + this.carga +"%");
        System.out.println("A caneta está tampada? " + this.tampada);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não posso rabiscar!");
        }
        else{
            System.out.println("Posso rabiscar!");
        }
    }
    void tampar(){ 
        this.tampada = true;
    }
    void destampar(){ 
        this.tampada = false;
    }
}
