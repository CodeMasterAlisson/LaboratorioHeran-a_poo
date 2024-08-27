package Lab01;

public class Aluno extends Refeitorio{

    private String nivel;

    public Aluno(){
        this.nivel = "Fundamental";
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString(){
        return super.toString() + "\nNível: " + nivel;
    }
}
