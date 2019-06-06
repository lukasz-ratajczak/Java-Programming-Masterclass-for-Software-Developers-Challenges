import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0, repeater = 0;
        double average;
        int con =0;
        while(con==0){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int scannedNumber = scanner.nextInt();
                sum += scannedNumber;
                repeater++;
            }else{
                average =  Math.round((double) sum / repeater);
                int avg = (int) average;
                System.out.println("SUM = "+sum+" AVG = "+avg);
                con = 1;
            }
        }
    }
}
