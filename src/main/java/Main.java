import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount client1 = new BankAccount(42414124L,1000L,5443422,"BoB", "dupa@du.pl");
        client1.deposit(1000L);
        client1.withdraw(500L);
    }
}
