package aula9b;
public class Aula9b {
    public static void main(String[] args) {
        
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro [2];
        
        p[0] = new Pessoa ("Maria", 17, "Feminino");
        p[1] = new Pessoa ("José", 20, "Masculino");
        
        l[0] = new Livro ("Amor", "Gk", 300, p[1]);
        l[0].fechar();
        l[0].folhear(100);
        l[0].avancarPag();
        
        //O método toString retorna infomações do construtor.
        System.out.println(l[0].detalhes()); 
        
        System.out.println(p[0].getNome()); //mostra o nome da pessoa 
        
        
        
    }
    
}
