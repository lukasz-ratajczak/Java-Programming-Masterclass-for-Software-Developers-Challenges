import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger;
        Scanner scanner = new Scanner(System.in);

        int selector;

        System.out.println("Hello. Make Your Burger by yourself! :)");

        do {
            boolean corrector;
            System.out.println("First, choose a burger type:");
            System.out.println("1) Hamburger");
            System.out.println("2) Healthy burger");
            System.out.println("3) Deluxe burger");
            corrector = scanner.hasNextInt();
            if (!corrector) {
                System.out.println("Choose valid option");
                continue;
            }
            selector = scanner.nextInt();
            if (selector >= 1 && selector <= 3) {
                hamburger = burgerTypeOption(selector);
                break;
            }
            System.out.println("Choose valid option");
        } while (true);


        if (hamburger.getClass().getSimpleName().equals("Hamburger")) {
            hamburger.getAdditions();
            System.out.println("Your price for burger is: "+hamburger.getPrice()+"$");
        } else if (hamburger.getClass().getSimpleName().equals("HealthyBurger")) {
            hamburger.getAdditions();
            System.out.println("Your price for burger is: "+hamburger.getPrice()+"$");
        } else if (hamburger.getClass().getSimpleName().equals("DeluxeBurger")) {
            hamburger.getAdditions();
            System.out.println("Your price for burger is: "+hamburger.getPrice()+"$");
        } else {
            System.out.println("Error! :/");
        }


    }

    public static Hamburger burgerTypeOption(int selector) {
        switch (selector) {
            case 1:
                return new Hamburger();
            case 2:
                return new HealthyBurger();
            case 3:
                return new DeluxeBurger();
            default:
                return new Hamburger();
        }
    }
}
