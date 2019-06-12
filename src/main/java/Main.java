import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1,1,5,5,"Animal");
        Dog dog = new Dog(5, 5,"Yorky", 1,4,1,20,"long silky");

        dog.eat();
    }
}
