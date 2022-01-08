package exerciciopooaldo;
public class ExercicioPooAldo {
    public static void main(String[] args) {
       
        Termostato aparelho = new Termostato("Aparelho 1");
        
        //Primeira parte do exercício
        
        aparelho.ligaDesliga();
        for(int c=0; c <3; c++){
            aparelho.aumentaTemperatura();
        }
    
        for(int c=0; c<5; c++){
            aparelho.diminuiTemperatura();
        }
        
        aparelho.status();
        
        System.out.println("-----------------------------------");
        
        //Segunda parte do exercício 
        
        Termostato t1 = new Termostato("Termostato 1");
        
        t1.aumentaTemperatura();
        t1.aumentaTemperatura();
        t1.status();
      
        System.out.println("-----------------------------------");
        //Terceira parte do exercício 
        
        Termostato termo = new Termostato("Termo 1");
        
        termo.ligaDesliga();
        for(int c=0; c<8;c++){
            termo.aumentaTemperatura();
        }
        for(int c=0; c<2;c++){
            termo.diminuiTemperatura();
        }
        termo.ligaDesliga();
        termo.status();
        
    }
    
}
