package novotermostato;
public class Termostato {
   
    
    private String id;
    private boolean estado = false;
    private float temperatura;
    public int aumenta;
    public int diminui;

    public Termostato(String id, boolean estado, int aumenta, 
            int diminui){
        this.id = id;
        this.estado = estado;
        this.aumenta = aumenta;
        this.diminui = diminui;
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

    public int getAumenta() {
        return aumenta;
    }

    public void setAumenta(int aumenta) {
        this.aumenta = aumenta;
    }

    public int getDiminui() {
        return diminui;
    }

    public void setDiminui(int diminui) {
        this.diminui = diminui;
    }
    
    
    public void ligaDesliga(){
            
            this.setEstado(true);
            if(this.getEstado()){
                this.setTemperatura(80f);
                System.out.println(this.getId() + " ligou!!");
                System.out.println("Temperatura inicial é de: " 
                        + this.getTemperatura());
                   
                System.out.println("------------------");
            }
            this.setEstado(false);
            if(this.getEstado() == false){    
                System.out.println(this.getId() + " desligou!");   
  
            }  
        
    }
    
    public void aumentaTemperatura(){
        this.setEstado(true);
        if(this.getEstado()) {
                this.setTemperatura(this.getTemperatura() + 1);   
              
        }
        
        if(this.getTemperatura() > 85f){
            this.setTemperatura(80f);
            System.out.println("Temperatura é de: " + this.getTemperatura());
                    
        }
        else{
            System.out.println("Temperatura aumentou para: " + 
                            this.getTemperatura());
        }
    }
     
    public void diminuiTemperatura(){
       if(this.getEstado()){
               this.setTemperatura(this.getTemperatura() - 1);
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

    
    
    
    
    
    
    
    
    
    

