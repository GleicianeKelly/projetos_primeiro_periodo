package mealdopostode.saude;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MEAldoPostodeSaude {
    
    
    static Posto posto1 = new Posto(1234, "Saúde +");
    static Posto posto2 = new Posto (4567, "Mais saúde");
    static Vacina vacina1 = new Vacina (1212, "Coronavac", 'N');
    static Vacina vacina2 = new Vacina (3131, "Pfizer", 'E');
    static Vacina vacina3 = new Vacina (4545, "Coronavac", 'N');
    static Vacina vacina4 = new Vacina (8989, "Aztrazenica", 'N');
    static Vacina vacina5 = new Vacina (6767, "Pfizer", 'E');
    
    static List<Posto> listaPosto = new ArrayList<Posto>();
    static List<Vacina> listaVacina = new ArrayList<Vacina>();
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        
        
        int opcao = 0;
        
        while(true){
            
            System.out.println("Digite 1 para registrar movimento");
            System.out.println("Digite 2 para Consultar repasse");
            System.out.println("Digite 3 para consultar estoque");
            System.out.println("Digite 0 para sair");
            opcao = ler.nextInt();
            
            
            if(opcao == 0){
                System.out.println("Programa encerrado! ");
                break;
            }
            
            switch(opcao){
                
                case 1: 
                    registrarMovimento();
                    break;
                
                case 2: 
                    consultarRepasse();
                    break;
                    
                case 3: 
                    consultarEstoque();
                    break;
                    
                default: 
                    System.out.println("Opção inválida, digite novamente");
                    break;
                
            }
             
        }
         
        
    
        listaPosto.add(posto1);
        listaPosto.add(posto2);
        listaVacina.add(vacina1);
        listaVacina.add(vacina2);
        listaVacina.add(vacina3);
        listaVacina.add(vacina4);
        listaVacina.add(vacina5);
        
}
    
    
    
    public static Posto pesquisarPosto (int idPosto) {
        for(Posto posto : listaPosto) {
            if (posto.getIdPosto() == idPosto) {
                return posto;
            }
        }
        return null;
    }
    
    public static Vacina pesquisarVacina(int idVacina){
        for(Vacina vacina: listaVacina){
            if(vacina.getIdVacina() == idVacina){
                return vacina;
            }
        }
        return null;
    }
    
    public static void registrarMovimento() throws ParseException{
        
        System.out.println("**Registrar movimento **");
        
         if(listaPosto.isEmpty()){
            System.out.println("Repositório vazio! ");
            return;
        }
         
         if(listaVacina.isEmpty()){
             System.out.println("Repositório vazio! ");
             return;
         }
        
        while(true){
            
           
            int idPosto;
            int idVacina;
            Character movimento;
            int quantidadeDoses;
            
            
                try{
                    System.out.println("\nDigite o id: ");
                    idPosto = ler.nextInt();
                }

                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                if(idPosto == 0){
                    System.out.println("Cadastro encerrado! ");
                    return;
                }

                Posto postoEncontrado = pesquisarPosto(idPosto);
                
                if(postoEncontrado != null){
                    System.out.println("Posto encontrado!");
                   
                }
                else{
                    System.out.println("Posto não cadastrado no sistema");
                    continue;
                }
                
                try{
                    System.out.println("\nDigite o id: ");
                    idVacina = ler.nextInt();
                }

                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                if(idVacina == 0){
                    System.out.println("Cadastro encerrado! ");
                    return;
                }

                Vacina vacinaEncontrada = pesquisarVacina(idVacina);
                
                if(vacinaEncontrada != null){
                    System.out.println("Vacina encontrada! ");
                }
                else{
                    System.out.println("Vacina não cadastrada! ");
                    continue;
                }
                
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println("Digite a data da manutenção: ");
                System.out.println("Formato da data dd/MM/yyyy");
                String dataInformada = ler.next();
                Date data = formato.parse(dataInformada);
                
                System.out.println("Qual tipo de movimento? A ou E? ");
                movimento = ler.next().charAt(0);
             
                if(!movimento.equals('A') || !movimento.equals('a') ||
                               !movimento.equals('E') || !movimento.equals('e')){
                    System.out.println("Tipo de movimento incorreto");
                    continue;
                           
                }
                
             
                System.out.println("Qual a quantidade de doses? ");
                quantidadeDoses = ler.nextInt();


                Movimento movimentos = new Movimento(vacinaEncontrada, data, 
                        movimento, quantidadeDoses);

                postoEncontrado.registraMovimento(movimentos);
        }
    }
        
        
    public static void consultarRepasse(){
        System.out.println("**Consultar repasse**");
        
        if(listaPosto.isEmpty()){
            System.out.println("Repositório vazio! ");
            return;
        }
        
        while(true){
            
           
            int idPosto;
            
            
                try{
                    System.out.println("\nDigite o id: ");
                    idPosto = ler.nextInt();
                }

                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                if(idPosto == 0){
                    System.out.println("Cadastro encerrado! ");
                    return;
                }

                Posto postoEncontrado = pesquisarPosto(idPosto);
                
                
                if(postoEncontrado != null){
                    System.out.println("Posto encontrado!");
                   
                }
                else{
                    System.out.println("Posto não cadastrado no sistema");
                    continue;
                }
                
                
                
                double valorTotal = 0;
                
                for(Movimento movimento : postoEncontrado.getMovimento()){
                    if(movimento.getTipoMovimento().equals('A') || movimento.getTipoMovimento().equals('a')){
                                System.out.println("Id do posto: " + postoEncontrado.getIdPosto());
                                System.out.println("Nome do posto: " + postoEncontrado.getNome());
                                System.out.println("Id do movimento: " + movimento.getIdMovimento());
                                System.out.println("Data da movimentação: " + movimento.getData());
                                System.out.println("Quantidade de doses: " + movimento.getQuantidade());
                                System.out.println("Valor do repasse: " + movimento.calculaRepasse());
                                 
                    }          
                                valorTotal += movimento.calculaRepasse();
                                
                }
                            System.out.println("Valor Total do repasse: " + valorTotal); 
            } 
                        
    
        }
                           
                       
                
                   
                
                
           
        
    
    
    
    
    public static void consultarEstoque(){
        
        System.out.println("**Consultar estoque**");
        
        if(listaPosto.isEmpty()){
            System.out.println("Repositório vazio! ");
            return;
        }
        
        while(true){
            
            int idPosto;
            
                try{
                    System.out.println("\nDigite o id: ");
                    idPosto = ler.nextInt();
                }

                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                if(idPosto == 0){
                    System.out.println("Cadastro encerrado! ");
                    return;
                }

                Posto postoEncontrado = pesquisarPosto(idPosto);
                
                
                if(postoEncontrado != null){
                    System.out.println("Posto encontrado!");
                   
                }
                else{
                    System.out.println("Posto não cadastrado no sistema");
                    continue;
                }
                
                
            int totalDeDoses = 0;
            for(Movimento movimentos: postoEncontrado.getMovimento()){
                System.out.println(postoEncontrado.toString());
                System.out.println("6 - Estoque de Vacina do posto: " + 
                        postoEncontrado.obtemEstoque(movimentos.getVacina()));
               
                
                totalDeDoses = totalDeDoses + movimentos.getQuantidade();
                
            }
            
            System.out.println("Total de doses do posto: " + totalDeDoses);
        }
    
}
        
        
        
        
        
    
    
       
        
}
    
     
        
    
    
    
   
    
    


