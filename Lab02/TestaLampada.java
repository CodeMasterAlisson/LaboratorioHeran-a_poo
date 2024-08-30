package Lab02;

public class TestaLampada {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.acender();
        System.out.println("Lampada comum: " + lampada);

        LampadaPiscaPisca lampadaPisca = new LampadaPiscaPisca();

        System.out.println("Lampada Pisca: " + lampadaPisca);
    }
}
