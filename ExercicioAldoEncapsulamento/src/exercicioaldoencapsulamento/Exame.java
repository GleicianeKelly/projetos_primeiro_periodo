package exercicioaldoencapsulamento;
public class Exame {
    
    private int id;
    private String tipoExame;
    private int nivelGlicose; 

    public Exame(int id, String tipoExame, int nivelGlicose) {
        this.id = id;
        this.tipoExame = tipoExame;
        this.nivelGlicose = nivelGlicose;
    }
    
    public void status(){
        System.out.println("Id paciente: " + this.getId());
        System.out.println("Tipo de exame: " + this.getTipoExame());
        System.out.println("Nível de glicose: " + this.getNivelGlicose());
        obterDiagnostico();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public int getNivelGlicose() {
        return nivelGlicose;
    }

    public void setNivelGlicose(int nivelGlicose) {
        this.nivelGlicose = nivelGlicose;
    }
    
    
    public void obterDiagnostico(){
        if(this.nivelGlicose <= 99){
            System.out.println("Diagnóstico: Normal");
        }
        else if(this.nivelGlicose >= 100 && this.nivelGlicose <=125){
            System.out.println("Diagnóstico: Pré diabetes ");
        }
        else{
            System.out.println("Diagnóstico: Diabetes");
        }
    }
}
