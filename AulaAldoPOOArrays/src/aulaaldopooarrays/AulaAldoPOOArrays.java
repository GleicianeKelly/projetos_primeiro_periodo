package aulaaldopooarrays;
import java.util.Scanner;
public class AulaAldoPOOArrays {
    
    static String[] exames = null;
    static Scanner ler = new Scanner(System.in);
    static int contaExames = 0;
    public static void main(String[] args) {
      
        
        
        int opcao= 0;
        while(true){
            System.out.println("\n *** Seletor de opções ***");
            System.out.println();
            System.out.println("1 - Criar Array");
            System.out.println("2 - Cadastrar exame");
            System.out.println("3 - Consultar exame");
            System.out.println("4 - Listagens de exame");
            System.out.println("Finalizar");
            
            System.out.println("Opcão: ");
            opcao = ler.nextInt(); 
            
            switch(opcao){
                
                case 1: 
                    criarArray();
                    break;
                    
                case 2: 
                    cadastrarExame();
                    break;
                case 3: 
                    consultarExame();
                    break;
                case 4: 
                    listarExame();
                    break;
                case 0:
                    System.out.println("\n *** Programa finalizado ***");
                    return;
                default:
                    System.out.println("\n ***Opção incorreta ***");
                    break;
            }
            
        }
         
    }
    public static void criarArray(){
        System.out.println("\n *** Criação de array ***");
    }
    
    public static void cadastrarExame(){
        System.out.println("\n *** Cadastro de exames ***");
    }
    
    public static void consultarExame(){
        System.out.println("\n *** Consulta de exames ***");
    }
    
    public static void listarExame(){
        System.out.println("\n *** Listagem de exames ***");
    }
    
    
}

