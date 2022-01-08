package metodogettersetter;
public class MetodoGetterSetter { 
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 0.5f, "Azul");
        c1.destampar();
        c1.status(); 
        System.out.println("Minha caneta é: " + c1.getModelo() +  " de ponta " + c1.getPonta()
        );
        
    }
    
}
