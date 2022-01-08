package mepoo;
import java.util.Scanner;
public class MEPoo {
    
    static Estacionamento[] estacionamentos = new Estacionamento[5];  
    static Scanner ler = new Scanner(System.in);
    static int contaEstacionamento = 0;      
    public static void main(String[] args) {
        
   
    int opcao = 0;
    while(true){    
        System.out.println("-----------------");
        System.out.println("1 - Cadastrar Estacionamento");
        System.out.println("2 - Consultar Estacionamento");
        System.out.println("3 - Alterar situação do estacionamento");
        System.out.println("0 - Finalizar");
        
        System.out.println("Digite a opção");
        opcao = ler.nextInt();
        
        switch (opcao){
           
            case 1: 
                cadastroEstacionamento();
                break;
                
            case 2: 
                consultarEstacionamento();
                break;
                
            case 3: 
                ativarDesativar();
                break;
                 
                
            case 0: 
                System.out.println("Programa finalizado");
                return;
                
            default: 
                System.out.println("Opção incorreta! ");
                break;
                  
        }
    }        
            
}
     public static int pesquisarDuplicidade(int codigo){
        int posicao = -1; 
        
        for(int c=0; c < estacionamentos.length; c++){
            if(estacionamentos[c] != null && estacionamentos[c].getCodigo() 
                    == codigo){
                posicao = c;
                break;
            }
        }return posicao;
    }
    
    
public static void cadastroEstacionamento(){
    
   
        while(true){
           do{

            System.out.println("Digite 0 para sair!");
            System.out.println("Informe o código:");
            int codigo = ler.nextInt();
            if(codigo == 0){
                System.out.println("Cadastro encerrado!");
                return;
            }
            if(pesquisarDuplicidade(codigo) != -1){
            System.out.println("cadastro já encontrado!");
            continue;
        }
            ler.nextLine();
            System.out.println("Informe o nome: ");
            String nome = ler.next();
            System.out.println("Informe a cidade: ");
            String cidade = ler.next();
            System.out.println("Quantidade de vagas: ");
            int quantVagas = ler.nextInt();
            System.out.println("Horas franquiadas: ");
            int horasFranquia = ler.nextInt();
            System.out.println("Valor franquia inicial: ");
            float valorFranquiaInicial = ler.nextFloat();
            System.out.println("Valor adicional hora: ");
            float adicionalHora = ler.nextFloat();

            estacionamentos[contaEstacionamento] = new Estacionamento
            (codigo, nome, cidade, quantVagas, horasFranquia, valorFranquiaInicial,
            adicionalHora);
            contaEstacionamento++;

            System.out.println("Cadastro feito!");

            if(contaEstacionamento == estacionamentos.length){
              System.out.println("Cadastros no limite!");
              return;
            }
         }while(contaEstacionamento == estacionamentos.length);   
        }

}
   
    
    public static void consultarEstacionamento(){
        
        while(true){
            
            System.out.println(" *** Digite 0 para finalizar ***");
            System.out.println("Digite o código do estacionamento: ");
            int codigo = ler.nextInt();
            
            if(codigo == 0){
                System.out.println("Programa encerrado! ");
                return;
            }
            
            int posicaoEncontrada = pesquisarDuplicidade(codigo);
            
            if(posicaoEncontrada == -1){
                System.out.println("Cadastro não encontrado! ");
                continue;
            }
            else{
                System.out.println(estacionamentos[posicaoEncontrada]); 
                System.out.println("Código encontrado! ");
                
                
            }
        
    }
       
        
    public static void ativarDesativar(){
        
        while(true){
            System.out.println("Digite 0 pra sair: ");
            System.out.println("Digite o codigo do cadastro: ");
            int codigo= ler.nextInt();
            
            if(codigo == 0){
                System.out.println("Finalizado! ");
                return;
            }
            
             int posicao = pesquisarDuplicidade(codigo);
            
            if(codigo == -1){
                System.out.println("Cadastro não encontrado! ");
                continue;
            }
           
            System.out.println("Para ativar digite *A*");
            System.out.println("Para desativar digite *D*");
            String ativaDesativa = ler.next();
            
            if(ativaDesativa.equalsIgnoreCase("a")){
               estacionamentos[posicaoEncontrada].status();
               estacionamentos[posicaoEncontrada].ativar();
            }
            else{
               estacionamentos[posicaoEncontrada].status();
               estacionamentos[posicaoEncontrada].desativar();
            }
            
            
            
        }
        
    }
  
    
}

  
    
    
   
        
      
            
       

