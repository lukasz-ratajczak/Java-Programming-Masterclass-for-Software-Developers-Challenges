import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.storeContact("Dupa", "51324124");
        mobilePhone.storeContact("Dupa", "51324124");
        mobilePhone.storeContact("asad", "5235135");
        mobilePhone.storeContact("fdgdfg", "4525246246");
        mobilePhone.storeContact("Dupasfafa", "51324124");
        mobilePhone.storeContact("asdaffasfa", "23523523552");

        mobilePhone.modifyContact("fdgdfg", "4525246246");

        mobilePhone.removeContact("Dupasfafa", "51324124");

mobilePhone.printContacts();
    }


}
