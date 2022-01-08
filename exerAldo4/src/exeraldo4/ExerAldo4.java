package exeraldo4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ExerAldo4 {
    
    static Scanner ler = new Scanner(System.in); 
    static List<Produto> listaProdutos = new ArrayList<Produto>(); 
    /*chamei a classe dentro da lista e criei o objeto listaProdutos*/
    static int quantidadeProducao = 0; //variável global para minhas subrotinas
    public static void main(String[] args) {
        
        
    int opcao;   
    while(true){  //Menu opções
        
        System.out.println("*** Escolha uma das opções ***");
        System.out.println("[1] Gerente de produção");
        System.out.println("[2] Estoquista");
        System.out.println("[3] Alterar produto:");
        System.out.println("[4] Excluir produto: ");
        System.out.println("Digite [0] para encerrar");
        opcao = ler.nextInt();
        
        if(opcao == 0){
            System.out.println("Programa encerrado!");
            break;
        }
        
        if(opcao == 1){
            System.out.println("Digite [1] para cadastrar: ");
            System.out.println("Digite [2] para registrar produção: ");
            opcao = ler.nextInt();
            switch(opcao){ //Escolha opçao
               
                case 1: 
                    cadastrarProduto();  //caso 1 chame essa subrotina...
                    break;
                    
                case 2:    
                 
                    registrarProducao();
                    break;
                    
                default:
                    System.out.println("Opção incorreta!"); /*se n for nenhum 
                    dos casos ele da um default e retorna ao menu*/ 
                    break;
                    
                
            } 
        }
        else if(opcao == 2){
            System.out.println("Digite [1] para consultar produto: ");
            System.out.println("Digite [2] para registrar saída de produtos");
            opcao = ler.nextInt();
            switch(opcao){

                case 1: 
                    consultarProduto();
                    break;
                    
                case 2: 
                    registrarSaida();
                    break;
                    
                default:
                    System.out.println("Opção incorreta!");
                    break;
                
            }
            
        }
        else if(opcao == 3){
            alterarProduto();
        }
        else{
            excluirProduto();
        }
             
    }    
        
    }
    
    /*Subrotina usada para descobrir o número que foi digitado, no caso o código, 
    se ele for digitado e for igual ao recebido ele retorna o número da posição 
    no array, senão ele retorna nulo*/
    public static Produto pesquisarProdutos (int codigo) {
		for(Produto produto : listaProdutos) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
		}
		return null;
	}	
    
    
    public static void cadastrarProduto(){
        int codigo;
        do{
            System.out.println("** Cadastrar produto **");
            System.out.println("Para sair digite 0");
            
                /*Tente fazer assim e receber um número inteiro... */
                try{
                    System.out.println("\nDigite o código: ");
                    codigo = ler.nextInt();
                }
                /*Caso não seja inteiro ele entra no catch da excessão e retorna
                a pergunta*/ 
                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                
                if(codigo == 0){
                    System.out.println("Cadastro encerrado! ");
                    return;
                }
                
                /*Chamei a subrotina que verifica o código. Se o digitado for 
                diferente de nulo é pq ele foi encontrado e já está cadastrado*/
                if(pesquisarProdutos(codigo) != null){
                    System.out.println("Produto já cadastrado!");
                    continue;
                }
                
                
                System.out.println("Digite a descrição: ");
                String descricao = ler.next();
                
                System.out.println("Digite o preço de custo: ");
                float precoCusto = ler.nextFloat();
                
                /*Inseri os dados no construtor */
                listaProdutos.add(new Produto(codigo, descricao, 
                        precoCusto));
        }while(true); 
            
    }
    
    
    public static void consultarProduto(){
        System.out.println("** Consultar Produtos **");
        
        //Se estiver vazia não tem nada cadastrado
        if(listaProdutos.isEmpty()){
            System.out.println("** Repositório Vazio **");
            return;
        }
        
        while(true){
            int codigo;
           
            System.out.println("Para sair digite 0");
            
                try{
                    System.out.println("\nDigite o código: ");
                    codigo = ler.nextInt();
                }
                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
            
            if (codigo == 0){
                System.out.println("Consulta encerrada!");
                return;
            }
            
            //Coloquei dentro de uma variável a subrotina de pesquisar código
            Produto produtoEncontrado = pesquisarProdutos(codigo);
            
            //chamei ela aqui
            if(produtoEncontrado == null){
                System.out.println("Produto não cadastrado!");
                continue;
            }
                    
            //Chamei o toString que retorna os valores de tudo que criei
            System.out.println(produtoEncontrado.toString());
            
        }
        
        
    }
    
    public static void registrarProducao(){
        
        System.out.println("** Registro de produção **");
        if(listaProdutos.isEmpty()){
            System.out.println("** Repositório vazio **");
            return;
            }
        
        while(true){
            
            int codigo;
           
            System.out.println("Para sair digite 0");
            
                try{
                    System.out.println("\nDigite o código: ");
                    codigo = ler.nextInt();
                }
                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                
                if(codigo == 0){
                    System.out.println("Registro encerrado! ");
                    return;
                }
                
                Produto produtoEncontrado = pesquisarProdutos(codigo);

                if(produtoEncontrado == null){
                    System.out.println("Produto não cadastrado!");
                    continue;
                }
                
                
            System.out.println("Quantidade produzida: ");
            quantidadeProducao = ler.nextInt();

            /*Chamei a posição do array que guarda as informações e o método
            da classe que recebe a produção e joga dentro do estoque e atualiza
            e passei dentro do método a variável da produção*/
            produtoEncontrado.producao(quantidadeProducao);
            System.out.println(produtoEncontrado.toString());
        }
        
                
        
    }
    
    public static void registrarSaida(){
        
        System.out.println("** Registro de saída **");
        if(listaProdutos.isEmpty()){
            System.out.println("** Repositório vazio **");
            return;
            }
        /*Lá em cima eu inicializei a variável com 0 para que se não tiver 
        produção ela fique 0 e não poderá ter saída*/
        if(quantidadeProducao == 0){
            System.out.println("Não houve produção! ");
            return;
        }
        
         while(true){
            
            int codigo;
           
            System.out.println("Para sair digite 0");
            
                try{
                    System.out.println("\nDigite o código: ");
                    codigo = ler.nextInt();
                }
                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                
                if(codigo == 0){
                    System.out.println("Registro encerrado! ");
                    return;
                }
                
                Produto produtoEncontrado = pesquisarProdutos(codigo);

                if(produtoEncontrado == null){
                    System.out.println("Produto não cadastrado!");
                    continue;
                }
                
                
            System.out.println("Quantidade de saída: ");
            int quantidadeSaida = ler.nextInt();
            
            
            if(quantidadeSaida > quantidadeProducao){
                System.out.println("Produção menor que a saída! ");
                System.out.println("Verifique e digite novamente: ");
                continue;
            }
            
            /*A quantidade de produção deve ser maior que a de saída, para que 
            eu possa subtrair a saída, chamar o método no número do array que 
            encontrei ao pedir o código e atualizar o estoque através do método
            de saída que recebe a variável que subtrai a a produção e a saída*/
            int quantidade = quantidadeProducao - quantidadeSaida;
            produtoEncontrado.saida(quantidade);
            System.out.println(produtoEncontrado.toString());
        }
        
    }
    
    public static void alterarProduto(){
        System.out.println("** Alterar produto **");
        if(listaProdutos.isEmpty()){
           System.out.println("** Repositório vazio **");
           return;
        }
        
        while(true){
            
            int codigo;
           
            System.out.println("Para sair digite 0");
            
                try{
                    System.out.println("\nDigite o código que deseja alterar: ");
                    codigo = ler.nextInt();
                }
                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                
                 if(codigo == 0){
                    System.out.println("Alteração encerrada! ");
                    return;
                }
                
                Produto produtoEncontrado = pesquisarProdutos(codigo);
                
                if(produtoEncontrado == null){
                    System.out.println("Produto não cadastrado!");
                    continue;
                }
                
                
            
            System.out.println("** Digite 1 para alterar código **");    
            System.out.println("** Digite 2 para alterar descrição **");
            System.out.println("** Digite 3 para alterar preço de custo **");
            int opcao = ler.nextInt();
            
            
            if(opcao == 1){
                System.out.println("Digite o novo código: ");
                int novoCodigo = ler.nextInt();
                produtoEncontrado.setCodigo(novoCodigo);
                /*Se a opção for essa, ele vai chamar a posição do array e o 
                método modificador (set) para passar a nova informação */
            }
            
            if(opcao == 2){
                System.out.println("digite a nova descrição: ");
                String novaDescricao = ler.next();
                produtoEncontrado.setDescricao(novaDescricao);
            }
            
            if(opcao == 3){
                System.out.println("Digite o novo preço de custo: ");
                float novoPrecoCusto = ler.nextFloat();
                produtoEncontrado.setPrecoCusto(novoPrecoCusto);
            }
                    
            System.out.println("** Produto alterado! **");
            System.out.println(produtoEncontrado.toString());
            
            
        }
        
        
    }   
    
    public static void excluirProduto(){
        System.out.println("** Excluir produto **");
        
        if(listaProdutos.isEmpty()){
           System.out.println("** Repositório vazio **");
           return;
        }
        while(true){
            
            int codigo;
           
            System.out.println("Para sair digite 0");
            
                try{
                    System.out.println("\nDigite o código que deseja excluir: ");
                    codigo = ler.nextInt();
                }
                catch(Exception e){
                    System.out.println("Opção deve ser numérica!");
                    System.out.println("Digite novamente: ");
                    ler.next();
                    continue;
                }
                
                if(codigo == 0){
                    System.out.println("Exclusão encerrada! ");
                    return;
                }
                
                Produto produtoEncontrado = pesquisarProdutos(codigo);
                
                if(produtoEncontrado == null){
                    System.out.println("Produto não cadastrado!");
                    continue;
                }
               
               /*Digito o código e chamo a subrotina que acha esse array
                chamo a minha lista e o remove, passando dentro dele o código 
                encontrado*/ 
               listaProdutos.remove(produtoEncontrado);
               System.out.println("Produto removido!");
               System.out.println("Lista de produtos atualizada: ");
               System.out.println(listaProdutos.toString());
                
                
        }      
        
        
    }
    
    
    
    
    
}

   