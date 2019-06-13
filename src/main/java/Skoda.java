public class Skoda extends Car {
    public Skoda(int cylinders, String model) {
        super(cylinders, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Skoda");
        super.startEngine();
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Skoda");
        super.accelerate(speed);
    }

    @Override
    public void brake(double brake) {
        System.out.println("Skoda");
        super.brake(brake);
    }
}
