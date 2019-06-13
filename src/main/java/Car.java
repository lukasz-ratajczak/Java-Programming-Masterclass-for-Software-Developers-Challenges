public class Car {
    private int cylinders, wheels, doors;
    private String model;
    private boolean engine;

    public Car(int cylinders, String model) {
        if (cylinders < 1) {
            this.cylinders = 1;
        } else {
            this.cylinders = cylinders;
        }
        this.model = model;
        this.wheels = 4;
        this.doors = 4;
        this.engine = true;
    }

    public void startEngine(){
        System.out.println("Engine of "+this.model+" has started");
    }
    public void accelerate(double speed){
        System.out.println("Car "+this.model+" has accelerated to "+speed+" km/h");
    }
    public void brake(double brake){
        System.out.println("Car "+this.model+" has decelerate to "+brake+" km/h");
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getModel() {
        return model;
    }

    public boolean isEngine() {
        return engine;
    }
}
