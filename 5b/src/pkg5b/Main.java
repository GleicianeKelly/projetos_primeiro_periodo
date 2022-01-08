package pkg5b;
public class Main {
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(1111);
       p1.setDono("Gleice");
       p1.setSaldo(1500);
       p1.setTipo("cc");
       p1.setStatus(true);
       p1.estadoAtual();
       p1.abrirConta("cc");
       p1.depositar(50);
       
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(2222);
       p2.setDono("Kelly");
       p2.setSaldo(1800);
       p2.setTipo("cp");
       p2.setStatus(false);
       p2.estadoAtual();
       
       
    }
    
    
}
