public class Main {
    public static void main(String[] args) {
        Car skoda = new Skoda(16, "Fiesta");
        skoda.accelerate(50);

        Car toyota = new Toyota(8, "Passat");
        toyota.brake(40);

        Car fiat = new Fiat(4, "Mondeo");
        fiat.startEngine();
        fiat.accelerate(100);
        fiat.brake(60);
        System.out.println(fiat.getDoors());
        System.out.println(fiat.getModel());
        System.out.println(fiat.getCylinders());
        System.out.println(fiat.isEngine());
    }
}
