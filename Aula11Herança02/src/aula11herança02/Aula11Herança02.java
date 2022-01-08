package aula11herança02;
public class Aula11Herança02 {
    public static void main(String[] args) {
       
        Visitante v1 = new Visitante();
        v1.setNome("Gleice");
        v1.setIdade(31);
        v1.setSexo("Feminino");
        System.out.println("Visitante: " + v1.toString());
        System.out.println("-----------------");
        
        Aluno a = new Aluno();
        a.setNome("Mariah");
        a.setIdade(45);
        a.setSexo("Feminino");
        a.setMatricula(1234);
        a.setCurso("Técnico");
        System.out.println("Aluno:" + a.toString());
        a.pagarMensalidade();
        System.out.println("--------------------");
        
        Bolsista b = new Bolsista();
        b.setNome("Carey");
        b.setIdade(20);
        b.setSexo("Feminino");
        b.setMatricula(12345);
        System.out.println("Bolsista: " + b.toString());
        b.pagarMensalidade();
        
        
        
        
        
        
    }
    
}
