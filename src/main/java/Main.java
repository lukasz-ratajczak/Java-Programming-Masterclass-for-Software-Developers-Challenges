import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define number of elements: ");
        int numberOfElements = scanner.nextInt();
        System.out.println("Define all elements: ");
        int[] inputArray = getIntegers(numberOfElements);
        System.out.println("Input:");
        printArray(inputArray);

        int[] outputArray = sortArray(inputArray);

        System.out.println("Output:");
        printArray(outputArray);
    }

    public static int[] sortArray(int[] inputArray){

        int[] outputArray = new int[inputArray.length];
        int[] tempArray = new int[inputArray.length];

        for (int j = 0; j < inputArray.length; j++) {
            for (int i = 0; i < inputArray.length-1; i++) {
                if(inputArray[i] > inputArray[i+1]){
                    tempArray[i] = inputArray[i+1];
                    inputArray[i+1] = inputArray[i];
                    inputArray[i] = tempArray[i];
                }
            }
        }

        return inputArray;
    }

    public static void printArray(int[] arrayToPrint){
        for (int i1 : arrayToPrint) {
            System.out.println(i1);
        }
    }
    public static int[] getIntegers(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = new int[numberOfElements];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }

}
