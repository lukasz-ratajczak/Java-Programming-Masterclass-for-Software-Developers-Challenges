import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private Name name = new Name();
    private PhoneNumber phoneNumber = new PhoneNumber();

    public void storeContact(String contact, String number) {
        if (name.storeContact(contact)) {
            phoneNumber.storeContact(number);
        }
    }

    public void modifyContact(String contact, String number) {
        if (name.modifyContact(contact)) {
            phoneNumber.modifyContact(number);
        }
    }

    public void removeContact(String contact, String number) {
        if (name.removeContact(contact)) {
            phoneNumber.removeContact(number);
        }
    }

public void printContacts(){
    for (int i = 0; i < name.getName().size(); i++) {
        System.out.println(" ");
        System.out.println(name.getName().get(i));
        System.out.println(phoneNumber.getNumber().get(i));
    }
}
}
