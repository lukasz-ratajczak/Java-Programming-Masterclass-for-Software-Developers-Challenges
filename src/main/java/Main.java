import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Bank bank = new Bank("ING");

        bank.addBranch("Premium");

        bank.addCustomer("Premium", "Stefan", 500);
        bank.addCustomer("Premium", "Borek", 1987);
        bank.addCustomer("Premium", "Endi", 245);

        bank.addCustomerTransaction("Premium", "Stefan", 500);

        bank.listCustomers("Premium",true);
    }
}
