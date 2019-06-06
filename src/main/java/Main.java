import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int con = 0;
        int sum = 0;
        while(con <10){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give value: ");
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int value = scanner.nextInt();
                sum +=value;
                con++;
            }else{
                System.out.println("Invalid input");
            }
        }
        System.out.println("Sum is: "+ sum);
    }
}
