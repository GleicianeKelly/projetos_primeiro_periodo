package exe_aldo;
public class Exe_aldo {
    public static void main(String[] args) {
        Fontes[] produto = new Fontes[2];
        
         produto[0] = new Fontes("Fonte 1", 2.34f, 223, 0, 3);
         produto[0].status();
         System.out.println("***************************");
         produto[1] = new Fontes("Fonte 2", 3.45f, 224, 12, 2);
         produto[1].status();
        
    }
    
}
