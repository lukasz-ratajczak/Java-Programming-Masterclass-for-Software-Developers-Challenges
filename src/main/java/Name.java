import java.util.ArrayList;

public class Name  {

    private ArrayList<String> name = new ArrayList<>();

    public ArrayList<String> getName() {
        return name;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }

    public boolean storeContact(String name) {
        if (this.name.contains(name)) {
            System.out.println("There is a such an contact");
            return false;
        } else {
            this.name.add(name);
            System.out.println("Contact with name " + name + " added");
            return true;
        }
    }

    public boolean modifyContact(String name) {
        int position = findItem(name);
        if (this.name.contains(name)) {
            this.name.set(position, name);
            System.out.println("Contact name changed to: " + name);
            return true;
        } else {
            System.out.println("There is not a such an contact");
            return false;
        }

    }

    public boolean removeContact(String name) {
        int position = findItem(name);
        if (this.name.contains(name)) {
            this.name.remove(position);
            System.out.println("Contact " + name+ " removed");
            return true;
        } else {
            System.out.println("There is not a such an contact");
            return false;
        }
    }

    public int findItem(String searchItem) {
        return name.indexOf(searchItem);
    }
}

