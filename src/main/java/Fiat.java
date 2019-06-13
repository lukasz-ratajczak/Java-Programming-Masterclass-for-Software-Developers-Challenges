public class Fiat extends Car {
    public Fiat(int cylinders, String model) {
        super(cylinders, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Fiat");
        super.startEngine();
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Fiat");
        super.accelerate(speed);
    }

    @Override
    public void brake(double brake) {
        System.out.println("Fiat");
        super.brake(brake);
    }
}
