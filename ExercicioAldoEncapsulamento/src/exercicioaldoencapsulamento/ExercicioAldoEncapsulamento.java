package exercicioaldoencapsulamento;
import java.util.Scanner;
public class ExercicioAldoEncapsulamento {

    public static void main(String[] args) {

        
    Scanner ler = new Scanner(System.in);

    for(;;){    
        System.out.println("Informe ID do exame: ");
        int id = ler.nextInt(); 
        
        System.out.println("Informe o tipo de exame: ");
        String tipoEx = ler.next();
        
        System.out.println("Nível de glicose: ");
        int nivelGlic = ler.nextInt();
        
        System.out.println("-------------------");
    
    
    Exame diagnostico = new Exame(id, tipoEx, nivelGlic);
        
        diagnostico.status();
        System.out.println("****************************");
        
        System.out.println("Deseja sair? S/N");
        String saida = ler.next();
        
        if(saida.equalsIgnoreCase("s")){
            break;
        }
        else{
           continue;
        }
    }
    
   }
}

