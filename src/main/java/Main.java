import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Printer HP8020 = new Printer(60, 20, true);
    Printer SM6040M = new Printer(50, 50, false);

        for (int i = 0; i < 30; i++) {
            System.out.println("Printer HP:");
            HP8020.printPage();
            System.out.println(" ");
            System.out.println("Printer SM:");
            SM6040M.printPage();
            System.out.println(" ");
        }
        HP8020.changeToner();
        SM6040M.changeToner();
        for (int i = 0; i < 30; i++) {
            System.out.println("Printer HP:");
            HP8020.printPage();
            System.out.println(" ");
            System.out.println("Printer SM:");
            SM6040M.printPage();
        }
        System.out.println(" ");
        System.out.println(HP8020.getTonerLevel());
        System.out.println(SM6040M.getTonerLevel());
        System.out.println(" ");
        System.out.println(HP8020.getPrintedPages());
        System.out.println(SM6040M.getPrintedPages());

    }
}
