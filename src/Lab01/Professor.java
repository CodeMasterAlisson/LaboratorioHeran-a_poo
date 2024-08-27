package Lab01;

public class Professor extends Refeitorio{

    private double saldo;

    public Professor(){

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
