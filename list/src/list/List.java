package list;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
    

 
    ArrayList<Integer> nota = new ArrayList<Integer>();
    nota.add(0, 10);
    nota.add(1, 20);
    nota.add(2, 10);
    nota.add(3, 15);
    nota.add(4, 5);
    nota.add(5, 30); 
    
    int tamanhoTime = 6;
    
    int tamanhoSeguimento = 3;
    
    int maiorUm = 0, maiorDois = 0, removidoUm, removidoDois;
    long somaUm=0;         
    
        for(int c=0; c< 10; c++){
            if(nota.get(0) > nota.get(1) && nota.get(0) >                                nota.get(2)){
                maiorUm = nota.get(0);
                removidoUm = nota.remove(0);
                System.out.println("A maior nota das 3 primeiras notas foi              " + maiorUm);
            }
            else if(nota.get(1) > nota.get(0) && nota.get(1) >                           nota.get(2)){
                maiorUm = nota.get(1);
                removidoUm =nota.remove(1);
                System.out.println("A maior nota das 3 primeiras notas foi              " + maiorUm);
            }
            else if(nota.get(2) > nota.get(0) && nota.get(2) >                           nota.get(1)){
                maiorUm = nota.get(2);
                removidoUm = nota.remove(2);
                System.out.println("A maior nota das 3 primeiras notas foi              " + maiorUm);
            }
            
            System.out.println("A soma das maiores notas foi: " + nota.size());
        }   
        
        
    }
}