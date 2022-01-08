package aula10;
public class Aula10 {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(); 
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        
        p2.setNome("Kelly");
        p2.setIdade(15);
        p2.setSexo("Feminino");
        p3.setNome("João");
        p3.setIdade(45);
        p3.setSexo("Masculino");
        System.out.println(p2.status());
        System.out.println("---------------------");
        System.out.println(p3.status());
    }
    
}
