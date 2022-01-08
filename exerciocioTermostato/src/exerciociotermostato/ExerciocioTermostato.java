package exerciociotermostato;
public class ExerciocioTermostato {
    public static void main(String[] args) {
      
        /*Termostato[] aparelho = new Termostato[2];
        
        
        aparelho[0] = new Termostato("Aparelho 1", false, 5, 2 );
        aparelho[0].ligaDesliga();
        System.out.println("**********************************");
        aparelho[1] = new Termostato("Aparelho 2", false, 3, 1);
        aparelho[1].ligaDesliga();*/
        
        
        
        Termostato aparelho = new Termostato("Aparelho 1", 5, 3);
        
        aparelho.aumentaTemperatura();
        aparelho.ligaDesliga();
        
        
    }
    
}
