package exerciociotermostato;
public class Termostato {
    
    private String id;
    private boolean estado;
    private float temperatura;
    private int incremento;
    private int decremento;

    public Termostato(String id, int incremento, 
            int decremento){
        this.id = id;
        this.estado = false;
        this.incremento = incremento;
        this.decremento = decremento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public int getDecremento() {
        return decremento;
    }

    public void setDecremento(int decremento) {
        this.decremento = decremento;
    }
    
    
    public void ligaDesliga(){
            
            this.setEstado(true);
            if(this.getEstado()){
                this.setTemperatura(80f);
                System.out.println(this.getId() + " ligou!!");
                System.out.println("Temperatura inicial é de: " 
                        + this.getTemperatura());
                aumentaTemperatura();
                diminuiTemperatura();   
                System.out.println("------------------");
            }
            this.setEstado(false);
            if(this.getEstado() == false){    
                System.out.println(this.getId() + " desligou!");   
  
            }  
        
    }
    
    public void aumentaTemperatura(){
        if(this.getEstado()) {
            for(int c=1; c <= this.getIncremento(); c++){
                this.setTemperatura(80f + c);   
            }     
        }
        else{
            System.out.println("Aparelho desligado!");
        }
        if(this.getTemperatura() > 85f){
            this.setTemperatura(85f);
            System.out.println("Temperatura é de: " + this.getTemperatura());
                    
        }
        else{
            System.out.println("Temperatura aumentou para: " + 
                            this.getTemperatura());
        }
    }
     
    public void diminuiTemperatura(){
       if(this.getEstado()){
           for(int i = 0; i < this.getDecremento(); i--){
               this.setTemperatura(this.getTemperatura() - i);
           }
       }else{
           System.out.println("Aparelho desligado! ");
       }
       if(this.getTemperatura() < 80){
           this.setTemperatura(80f);
           System.out.println("Temperatura atual é de: " + 
                   this.getTemperatura());
           
       }
       else{
           System.out.println("Temperatura diminuiu para: " + 
                   this.getTemperatura());
       }
        
    } 
}
