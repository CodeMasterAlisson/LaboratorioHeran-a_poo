package Lab01;

public class Tecnico extends Refeitorio {

    private double saldo;

    public Tecnico(){

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSaldo: R$ " + saldo;
    }
}
