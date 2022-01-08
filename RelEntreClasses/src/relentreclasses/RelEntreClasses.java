package relentreclasses;
public class RelEntreClasses {
    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[2];
        l[0] = new Lutador ("Gleice", "Brasil", 31, 1.75f, 70.7f, 11, 2, 6);
        l[0].apresentar();
        l[0].empatarLuta();
        l[0].status();
     
        l[1] = new Lutador ("Mariah", "EUA", 34, 1.77f, 77.4f, 4, 7, 8);
        l[1].apresentar();
        l[1].empatarLuta();
        l[1].status();
        
        
        Luta ufc = new Luta();
        ufc.marcarLuta(l[0], l[1]);
        ufc.lutar();
        
        
        
        
    }
    
}
