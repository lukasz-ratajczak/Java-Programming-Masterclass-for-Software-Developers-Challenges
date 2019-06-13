import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paintings paintings = new Paintings(46, 499);
        Electronic electronic = new Electronic(400, "TV");
        Furniture furniture = new Furniture(400, "Chair");

        Room room = new Room(4, furniture, electronic, paintings);

        House house = new House("Brick", "Plasteel", room);

        house.makeRoom();
    }
}
