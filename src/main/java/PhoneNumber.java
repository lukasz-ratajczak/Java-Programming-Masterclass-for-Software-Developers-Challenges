import java.util.ArrayList;

public class PhoneNumber  {

    private ArrayList<String> number = new ArrayList<>();

    public ArrayList<String> getNumber() {
        return number;
    }

    public void setNumber(ArrayList<String> number) {
        this.number = number;
    }

    public void storeContact(String number) {
            this.number.add(number);
            System.out.println("Contact with name " + number + " added");
    }

    public void modifyContact(String number) {
        int position = findItem(number);
        if (this.number.contains(number)) {
            this.number.set(position, number);
            System.out.println("Contact name changed to: " + number);
        } else {
            System.out.println("There is not a such an contact");
        }

    }

    public void removeContact(String number) {
        int position = findItem(number);
        if (this.number.contains(number)) {
            this.number.remove(position);
            System.out.println("Number " + number+ " removed");
        } else {
            System.out.println("There is not a such an contact");
        }
    }

    public int findItem(String searchItem) {
        return number.indexOf(searchItem);
    }
}
