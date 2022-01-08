package exerciciopooaldo;
public class Termostato {
    
    
    private String id;
    private boolean estado;
    private int temperatura;

    
    public void status() {
        if(this.estado){
            System.out.println(this.getId() + " ligado!");
            System.out.println("Id: " + this.getId());
            System.out.println("Temperatura atual: " + this.getTemperatura());
        }
        else{
            System.out.println("Aparelho desligado!");
        }
       
    }
    
    public Termostato(String id) {
        this.id = id;
        this.estado = false;
        
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

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    
    public void ligaDesliga(){
        
        if(this.estado == true){
            this.estado = false;    
        }
        else{
            this.estado = true;
            this.setTemperatura(80);
        }
    }
    
    public void aumentaTemperatura(){
        if(this.estado == true){
            this.temperatura++;
            if(this.getTemperatura() > 85){
                this.setTemperatura(85);
            }
        }
        
        else{
            System.out.println("Aparelho desligado!!");
        }
        
    }
    
    
    public void diminuiTemperatura(){
        if(this.estado == true){
            this.temperatura--;
            if(this.getTemperatura() < 80){
                this.setTemperatura(80);
            }
        }
        else{
            System.out.println("Aparelho desligado!!");
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
