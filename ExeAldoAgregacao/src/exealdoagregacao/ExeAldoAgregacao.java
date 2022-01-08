package exealdoagregacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
public class ExeAldoAgregacao {
    
    static Scanner ler = new Scanner(System.in);
    static List<Turma> listaTurma = new ArrayList<Turma>();
    static List<Matricula> listaMatricula = new ArrayList<Matricula>();
    static List<Aluno> listaAluno = new ArrayList<Aluno>();
    public static void main(String[] args) {
        
        int opcao;
        
        while(true){
            
            System.out.println("*************************");
            System.out.println("** Escola Novo Desafio **");
            System.out.println("*************************");
            System.out.println("Digite 1 para inserir aluno");
            System.out.println("Digite 2 para consultar alunos");
            System.out.println("Digite 3 para alterar aluno");
            System.out.println("Digite 4 para excluir aluno");
            System.out.println("Digite 5 para criar turma");
            System.out.println("Digite 6 para consultar turma");
            System.out.println("Digite 7 para excluir turma");
            System.out.println("Digite 8 para matricular aluno");
            System.out.println("Digite 9 para consultar matrícula");
            System.out.println("Digite 0 para sair");
            
            opcao = ler.nextInt();
            
            
            if(opcao == 0){
                System.out.println("Programa encerrado!!");
                break;
            } 
            
            switch(opcao){
                
                
                case 1: 
                    inserirAluno();
                    break; 
                
                case 2:
                    consultarAluno();
                    break;
                
                case 3:
                    AlterarAluno();
                    break;  
                
                case 4:
                    excluirAluno();
                    break;  
                
                case 5:
                    criarTurma();
                    break;   
                
                case 6:
                    consultarTurma();
                    break;   
                
                case 7:
                    excluirTurma();
                    break; 
                
                case 8:
                    matricularAluno();
                    break;     
                
                case 9:
                    consultarMatricula();
                    break; 
                
                default:
                    System.out.println("Opção incorreta!");
                    break;
                    
                
            }
           
        }
        
    }
        
    
    
    
    
    public static Matricula pesquisarMatricula (int idMatricula) {
        for(Matricula matricula : listaMatricula) {
            if (matricula.getId() == idMatricula) {
                return matricula;
            }
        }
        return null;
    }
        
    public static Turma pesquisarTurma (int idTurma) {
        for(Turma turma : listaTurma) {
            if (turma.getId() == idTurma) {
                return turma;
            }
        }
        return null;
    }
    
    public static Aluno pesquisarAluno (int idAluno) {
        for(Aluno aluno : listaAluno) {
            if (aluno.getId() == idAluno) {
                return aluno;
            }
        }
        return null;
    }
    
    public static void inserirAluno(){
        int idAluno;
        System.out.println("** Inserir Aluno **");
        
        
        while(true){
            System.out.println("Para sair digite 0");
            try{
                System.out.println("\nDigite o id: ");
                idAluno = ler.nextInt();
            }
            catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
            }
            if(idAluno == 0){
            System.out.println("Cadastro encerrado!");
            return;
            } 

            if(pesquisarAluno(idAluno) != null){
                System.out.println("Aluno já cadastrado!");
                continue;
            }
            
            System.out.println("Digite o nome do aluno: ");
            String nome = ler.next();
            
            
            Aluno alunos = (new Aluno(idAluno, nome));
            
            listaAluno.add(alunos);
        }       
    }
    
    public static void consultarAluno(){
        System.out.println("** Consultar alunos **");
        
        if(listaAluno.isEmpty()){
            System.out.println("Repositório vazio!!");
            return;
        }
        
        while(true){
           
            int idAluno;
            System.out.println("Para sair digite 0");
            
            try{
                System.out.println("\nDigite o id: ");
                idAluno = ler.nextInt();
            }
            catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
            }
            if(idAluno == 0){
            System.out.println("Consulta encerrada!");
            return;
            } 
            
            Aluno alunoEncontrado = pesquisarAluno(idAluno);
            
            if(alunoEncontrado == null){
                System.out.println("Aluno não cadastrado!! ");
                continue;
            }
            
            for(Aluno aluno : listaAluno){
                if(aluno.getId() == idAluno){
                    System.out.println(alunoEncontrado.toString());
                }
                else{
                    System.out.println("Aluno não encontrado na lista! ");
                }
            }
            
            
            
        }
        
        
    }
    
    
    public static void AlterarAluno(){
        System.out.println("** Alterar aluno **");
        
        if(listaAluno.isEmpty()){
            System.out.println("Repositótio vazio!! ");
        }
        
        while(true){
            int idAluno;
            
            System.out.println("Para sair digite 0");
            
            try{
                System.out.println("\nDigite o id: ");
                idAluno = ler.nextInt();
            }
            catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
            }
            if(idAluno == 0){
            System.out.println("Alteração encerrada!");
            return;
            } 
            
            Aluno alunoEncontrado = pesquisarAluno(idAluno);
            
            if(alunoEncontrado == null){
                System.out.println("Aluno não cadastrado!! ");
                continue;
            }
            
            System.out.println("Digite o nome do aluno: ");
            String novoNome = ler.next();
            alunoEncontrado.setNome(novoNome);
            
            System.out.println("Cadastro do aluno alterado! ");
            System.out.println(alunoEncontrado.toString());
            
        }
    }
        
    public static void excluirAluno(){
        System.out.println("** Excluir aluno **");
        
        if(listaAluno.isEmpty()){
            System.out.println("Repositótio vazio");
        }
        
        while(true){
            int idAluno;
           
            try{
                System.out.println("\nDigite o id do aluno: ");
                idAluno = ler.nextInt();
            }
            catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
            }
            if(idAluno == 0){
            System.out.println("Exclusão encerrada!");
            return;
            } 
            
            Aluno alunoEncontrado = pesquisarAluno(idAluno);
            
            if(alunoEncontrado == null){
                System.out.println("Aluno não cadastrado!! ");
                continue;
            
            }
            
            for(Matricula matricula : listaMatricula){
                if(matricula.getAluno().equals(idAluno)){
                    System.out.println("Aluno matriculado, impossível remover");
                }
                else{
                    listaAluno.remove(alunoEncontrado);
                    System.out.println("Aluno removido! ");
                    System.out.println(listaAluno.toString());
                }
            }
            
            
            
        }  
           
    }
    
    public static void criarTurma(){
        System.out.println("** Criar turma **");
        System.out.println("Digite 0 para sair");
        
        while(true){
            int idTurma, idMatricula, capacidade;
            while(true){
            try{
                System.out.println("\nDigite o id: ");
                idTurma = ler.nextInt();
            }
            catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
            }
            if(idTurma == 0){
            System.out.println("Cadastro encerrado!");
            return;
            } 

            if(pesquisarTurma(idTurma) != null){
                System.out.println("Turma já cadastrada!");
                continue;
            }
            
            System.out.println("Digite a descrição: ");
            String descricao = ler.next();
            
            System.out.println("Digite a capacidade: ");
            capacidade = ler.nextInt();
            
            try{
                System.out.println("\nDigite o id da matrícula: ");
                idMatricula = ler.nextInt();
            }
            catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
            }
            if(idMatricula == 0){
            System.out.println("Cadastro encerrado!");
            return;
            } 
            
            Matricula matriculaEncontrada = pesquisarMatricula(idMatricula);
            
            if(matriculaEncontrada != null){
                System.out.println("Matrícula já cadastrada!");
                continue;
            }
            
            
            Turma turma = (new Turma(idTurma, descricao, capacidade, 
                    (List<Matricula>) matriculaEncontrada));
            
            listaTurma.add(turma);
            
             
        }
        
    }
    
    }
    
    public static void consultarTurma(){
        System.out.println("** Consultar turma **");
        
        if(listaTurma.isEmpty()){
            System.out.println("Repositório vazio! ");
            return;
        }
        
        while(true){
            int idTurma;
            System.out.println("Para sair diigite 0");
             try{
                System.out.println("\nDigite o id: ");
                idTurma = ler.nextInt();
            }
            catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
            }
            if(idTurma == 0){
            System.out.println("Consulta encerrada!");
            return;
            } 
            
            Turma turmaEncontrada = pesquisarTurma(idTurma);
            
            if(turmaEncontrada == null){
                System.out.println("Turma não cadastrada!! ");
                continue;
            
            }
            
            
            System.out.println(turmaEncontrada.toString());
           
            
            
            
        }
        
        
    }
    
    public static void excluirTurma(){
        System.out.println("** Excluir turma **");
        
        if(listaTurma.isEmpty()){
            System.out.println("Repositório vazio!! ");
            return;
        }
        
        
        
        while(true){
            
            int idTurma;
            System.out.println("Para sair digite 0");
            
            if(listaAluno.isEmpty()){
                try{
                System.out.println("\nDigite o id: ");
                idTurma = ler.nextInt();
                }
                
                catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
                }
                
                if(idTurma == 0){
                    System.out.println("Exclusão encerrada!");
                    return;
                } 
            
                Turma turmaEncontrada = pesquisarTurma(idTurma);
            
                if(turmaEncontrada == null){
                    System.out.println("Turma não cadastrada!! ");
                    continue;
            
                }
                
                listaTurma.remove(turmaEncontrada);
                System.out.println("Turma removida!! ");
                System.out.println(listaTurma.toString());
            }
             
            else{
                System.out.println("Impossível remover turma!!");
                System.out.println("Ainda possui alunos na lista!! ");
                return;
            }
            
        }
        
    }
    
    public static void matricularAluno(){
        System.out.println("** Matricular aluno **");
        
        if(listaAluno.isEmpty()){
            System.out.println("Não tem alunos para se matricular! ");
            return;
        }
        
        while(true){
            
            int idMatricula ;
            int idAluno;
            int idTurma;
            Date data;
            System.out.println("Para sair digite 0");
            try{
                System.out.println("\nDigite o id da matrícula: ");
                idMatricula = ler.nextInt();
            }
            catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
            }
            if(idMatricula == 0){
            System.out.println("Matrícula encerrada!");
            return;
            } 

            Matricula matriculaEncontrada = pesquisarMatricula(idMatricula);
            
            if(matriculaEncontrada != null){
                System.out.println("Matrícula já cadastrada!");
                continue;
            }
            
            System.out.println("Informe a data: ");
            data = new Date();
            
            try{
                System.out.println("\nDigite o id do aluno: ");
                idAluno = ler.nextInt();
            }
            catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
            }
            if(idAluno == 0){
            System.out.println("Matrícula encerrada!");
            return;
            } 

            Aluno alunoEncontrado = pesquisarAluno(idAluno);
            
            if(alunoEncontrado == null){
                System.out.println("Aluno não encontrado!");
                continue;
            }
            
            try{
                System.out.println("\nDigite o id do turma: ");
                idTurma = ler.nextInt();
            }
            catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
            }
            if(idTurma == 0){
            System.out.println("Matrícula encerrada!");
            return;
            } 

           try{
                System.out.println("\nDigite o id do aluno: ");
                idAluno = ler.nextInt();
            }
            catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
            }
            if(idAluno == 0){
            System.out.println("Matrícula encerrada!");
            return;
            } 

            Turma turmaEncontrada = pesquisarTurma(idTurma);
            
            if(turmaEncontrada == null){
                System.out.println("Turma não encontrado!");
                continue;
            }
            
             
           Matricula matricula = new Matricula(idMatricula, new Date(), 
                   alunoEncontrado);
            
           listaMatricula.add(matricula);
           
           matricula.registrarMatricula(turmaEncontrada);
            
            
        }
        
        
    }
    
    
    public static void consultarMatricula(){
        
        System.out.println("** Consultar matrícula **");
        
        if(listaMatricula.isEmpty()){
            System.out.println("Repositório vazio! ");
            return;
        }
        if(listaAluno.isEmpty()){
            System.out.println("Repositório vazio!");
            return;
        }
        if(listaTurma.isEmpty()){
            System.out.println("Repositório vazio");
            return;
        }
        
        while(true){
            int idMatricula;
            System.out.println("Para sair digite 0");
            try{
                System.out.println("\nDigite o id da matrícula: ");
                idMatricula = ler.nextInt();
            }
            catch(Exception e){
                System.out.println("Opção deve ser numérica!");
                System.out.println("Digite novamente: ");
                ler.next();
                continue;
            }
            if(idMatricula == 0){
            System.out.println("Matrícula encerrada!");
            return;
            } 

            Matricula matriculaEncontrada = pesquisarMatricula(idMatricula);
            
            if(matriculaEncontrada != null){
                System.out.println("Matrícula já cadastrada!");
                continue;
            }
            
            //Terminar
                
            }
        }
            
            
        }
        
         
    
    
        
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

            
               
   