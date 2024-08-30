package Lab02;

public class Lampada {

    protected boolean estado;

    public Lampada(){
        apagar();
    }

    public void acender(){
        estado = true;
    }

    public void apagar(){
        estado = false;
    }

    @Override
    public String toString() {
        return "{" +
                "estado=" + estado +
                '}';
    }
}
