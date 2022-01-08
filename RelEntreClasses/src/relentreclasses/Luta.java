package relentreclasses;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    
    
    
    public void marcarLuta(Lutador l0, Lutador l1){
        if(l0.getCategoria().equals(l1.getCategoria())){
            if(l0 != l1){
                this.aprovada = true;
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            }
            else{
                this.aprovada = false;
                this.desafiado = null;
                this.desafiante = null;
            }
        }
        
        
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("-----Desafiado----");
            this.desafiado.apresentar();
            System.out.println("----Desafiante----");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch(vencedor){
                
                case 0: 
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                
                case 1: 
                    System.out.println("Vitória do: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 2:
                    System.out.println("Vitória do: " + this.desafiante.getNome()); 
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                
                
            }
            
            
            
            
        }
        else{
            System.out.println("Luta não pode acontecer! ");
        }
        
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
    
    
    
}
