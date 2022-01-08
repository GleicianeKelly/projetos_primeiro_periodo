package exercicioaldo;
public class ExercicioAldo {
    public static void main(String[] args) {
        
    
        
        Navio navios[] = new Navio[5];
        navios[0] = new BulkCarrirer(111, "gk", 12, 13.4f, 20, 25);
        navios[1] = new BulkCarrirer(123, "MC", 14, 11.3f, 30, 35);
        navios[2] = new FullContainer(234, "Acacio", 23, 500f, 40);
        navios[3] = new FullContainer(567, "kkk", 67, 560f, 44);
        navios[4] = new FullContainer(789, "lll", 78, 898f, 60);
        
        
        
        navios[0].status();
        
        
        for(Navio g : navios){
           g.status();
        }
        
        
         
        
   }
    
}
