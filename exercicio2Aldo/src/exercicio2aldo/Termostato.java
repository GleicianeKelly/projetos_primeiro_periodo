package exercicio2aldo;
public class Termostato {
    
    private String id;
    private float temperatura = 80;
    private boolean ligado = false;

  

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    /*Ligue o objeto, incremente 3 graus, decremente 5 e mostre a temp atual */
    public void ligaDesliga(){
        if(this.getLigado()){     
            System.out.println("Equipamento ligou e temperatura é de: " + this.getTemperatura());
            this.setTemperatura(this.getTemperatura() + 3);
            this.setTemperatura(this.getTemperatura() - 5);
            System.out.println("Temperatura atual: " + this.getTemperatura() );
        }
        else{
            System.out.println("Dispositivo desligado!");
        }
    }
     /*Incremente 2 graus e mostre a temperatura atual */
    public void tempAtual(){
        if(this.getLigado()){
            this.setTemperatura(this.getTemperatura() + 2);
            System.out.println("Temperatura atual: " + this.getTemperatura());
        }
    }
    
    /*Ligue o objeto, incremente 8 graus, decremente 2, 
    desligue o instrumento e mostre a temperatura atual */
    public void liga(){
        if(this.getLigado()){
            this.setTemperatura(this.getTemperatura() + 8);
            this.setTemperatura(this.getTemperatura() - 2);
            System.out.println("Equipamento ligado, temperatura: " + this.getTemperatura());
        }
        else if(this.getLigado() == false){
            System.out.println("O equipamento foi desligado!");
            
        }
    }
   
    public void status(){
        System.out.println("Equipamento " + this.getId());
        ligaDesliga();
        tempAtual();
        liga();
    }
       
    
    
}
