
package provaaldo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProvaAldo {
    
    
    
    
    
    static Maquina maquina1 = new Maquina (123, "Empilhadeira", 700);
    static Maquina maquina2 = new Maquina (456, "Esteira", 400);
    static List<Producao> listaProducao = new ArrayList<Producao>();
    static List<Maquina> listaMaquinas = new ArrayList<Maquina>();
    static List<Manutencao> listaManutencao = new ArrayList<Manutencao>();
    static Scanner ler = new Scanner(System.in);  
    public static void main(String[] args)throws ParseException {
     
         
        
        
        
        int opcao = 0;
        
        while(true){
            
            System.out.println("Digite 1 para registrar produção");
            System.out.println("Digite 2 para registrar manutenção");
            System.out.println("Digite 3 para consultar máquinas");
            System.out.println("Digite 0 para sair");
            opcao = ler.nextInt();
            
            
            if(opcao == 0){
                System.out.println("Programa encerrado! ");
                break;
            }
            
            switch(opcao){
                
                case 1: 
                    registrarProducao();
                    break;
                
                case 2: 
                    registrarManutencao();
                    break;
                    
                case 3: 
                    consultarMaquinas();
                    break;
                    
                default: 
                    System.out.println("Opção inválida, digite novamente");
                    break;
                
            }
             
        }
         
        
    for(int c=0; c < 1; c++){
        
        listaMaquinas.add(maquina1);
        listaMaquinas.add(maquina2);
    }
        
        
}
    
    
    public static Producao pesquisarProducao (int idProducao) {
		for(Producao producao : listaProducao) {
			if (producao.getIdProducao()== idProducao) {
				return producao;
			}
		}
		return null;
    }
    
    public static Maquina pesquisarMaquina (int idMaquina) {
		for(Maquina maquina : listaMaquinas) {
			if (maquina.getIdMaquina()== idMaquina) {
				return maquina;
			}
		}
		return null;
    }
    
    public static Manutencao pesquisarManutencao (int idManutencao) {
		for(Manutencao manutencao : listaManutencao) {
			if (manutencao.getIdManutencao() == idManutencao) {
				return manutencao;
			}
		}
		return null;
    }
    
    
    
    public static void registrarProducao() throws ParseException{
        
        System.out.println("** Registrar produção **");
        System.out.println("Para sair digite 0");
        
        
            while(true){
                int idProducao;
                int idMaquina;
                int horasProducao;
                try{
                    System.out.println("\nDigite o id da produção: ");
                    idProducao = ler.nextInt();
                }
                
                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                
                if(idProducao == 0){
                    System.out.println("Cadastro encerrado! ");
                    return;
                }
                
                
                Producao producaoEncontrada = pesquisarProducao (idProducao);
               
                if(producaoEncontrada != null){
                    System.out.println("Produção já cadastrada!");
                    continue;
                }
                
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println("Digite a data da manutenção: ");
                System.out.println("Formato da data dd/MM/yyyy");
                String dataInformada = ler.next();
                Date data = formato.parse(dataInformada);
                
                
                
                
               try{
                    System.out.println("\nDigite o id da maquina: ");
                    idMaquina = ler.nextInt();
                }
                
                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                
                if(idMaquina == 0){
                    System.out.println("Cadastro encerrado! ");
                    return;
                }
                
                Maquina maquinaEncontrada = pesquisarMaquina (idMaquina);
                
                if(maquinaEncontrada == null){
                    System.out.println("Máquina não cadastrada na lista! ");
                    continue;
                }
    
                System.out.println("Horas de produção da máquina: ");
                horasProducao = ler.nextInt();
            
                Producao producao = new Producao(idProducao, data, maquinaEncontrada, 
                        horasProducao);
                
                listaProducao.add(producao);
                
                maquinaEncontrada.registrarProducao(producao);
            
            }           
    }
    
    
    public static void registrarManutencao() throws ParseException{
        
        System.out.println("** Registrar manutenção** ");
        System.out.println("Para sair digite 0");
        
        while(true){
            
            int idManutencao;
            String descricao;
            char tipo;
            int horasAbatidas;
            int idMaquina;
            int opcao;
            int horasDeTrabalho;
            
            
             try{
                    System.out.println("\nDigite o id da manutenção: ");
                    idManutencao = ler.nextInt();
                }
                
                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                
                if(idManutencao == 0){
                    System.out.println("Cadastro encerrado! ");
                    return;
                }
                
                
                Manutencao manutencaoEncontrada = pesquisarManutencao(idManutencao);
               
                if(manutencaoEncontrada != null){
                    System.out.println("Manutenção já cadastrada!");
                    continue;
                }
                
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println("Digite a data da manutenção: ");
                System.out.println("Formato da data dd/MM/yyyy");
                String dataInformada = ler.next();
                Date data = formato.parse(dataInformada);
                
                
                try{
                    System.out.println("\nDigite o id da máquina que receberá "
                            + "a manutenção: ");
                    idMaquina = ler.nextInt();
                }
                
                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                
                if(idMaquina == 0){
                    System.out.println("Cadastro encerrado! ");
                    return;
                }
                
                
                Maquina maquinaEncontrada = pesquisarMaquina(idMaquina);
               
                if(maquinaEncontrada == null){
                    System.out.println("Máquina não encontrada!");
                    continue;
                }
                
               System.out.println("Descrição da manutenção: ");
               descricao = ler.next();
               
               System.out.println("Qual tipo de manutenção? ");
               System.out.println("C (corretiva) | P (preventiva)");
               
               tipo = ler.next().charAt(0);
               
               
               System.out.println("Digite 1 para quantidade de horas para abater"
                       + " na manutenção: ");
               System.out.println("Digite 2 para horas de trabalho da máquina: ");
               opcao = ler.nextInt();
               if(opcao == 1){
                   System.out.println("Digite a quantidade de horas para abater: ");
                   System.out.println("Se não tiver horas digite 0");
                   horasAbatidas = ler.nextInt();
                   
                   Manutencao manutencao = new Manutencao(idManutencao, data, 
                           descricao, tipo, horasAbatidas);
                   
                   listaManutencao.add(manutencao);
                   maquinaEncontrada.getManutencao().add(manutencao);
                   maquinaEncontrada.registrarManutencao(manutencao);
                   
                   
               }
            
               else{
                   System.out.println("Digite as horas de trabalho da máquina: ");
                   System.out.println("Se não tiver horas digite 0");
                   horasDeTrabalho = ler.nextInt();
                   
                   maquinaEncontrada.setHorasTrabalho(horasDeTrabalho);
               }
            
        }
        
    }
    
    
    
    public static void consultarMaquinas(){
        
        System.out.println("** Consultar máquinas **");
        
        if(listaMaquinas.isEmpty()){
            System.out.println("Nenhuma máquina cadastrada! ");
            return;
        }
        
        while(true){
            
            for (Maquina maquinas : listaMaquinas){
                 if(maquinas.getHorasTrabalho() > 
                         maquinas.getHorasParaManutencao()){
                     
                     System.out.println(maquinas.toString());
                     
                 }
            }
            
            
            
            
        }
        
        
    }
    
    
}
