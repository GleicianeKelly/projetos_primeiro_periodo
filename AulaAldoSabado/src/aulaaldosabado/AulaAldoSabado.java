package aulaaldosabado;

import java.util.Scanner;

public class AulaAldoSabado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        
        
        System.out.println("Qual a leitura? ");
        int leitura = ler.nextInt();
        
        System.out.println("Qual tipo? C/I/R");
        String tipoLeitura = ler.next();
        
        
        Imovel imovel = new Imovel(123, tipoLeitura, leitura, 0, 0);
        
        
        imovel.status();
        
        
        
        
        
        
        
        
    }
    
}
