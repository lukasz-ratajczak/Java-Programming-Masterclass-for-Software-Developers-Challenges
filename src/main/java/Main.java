import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int con = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (con != 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int value = scanner.nextInt();

                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }

            } else {
                System.out.println("Invalid input");
                con = 1;
            }
        }
        System.out.println("Min is: " + min + " and Max is: " + max);
    }
}
