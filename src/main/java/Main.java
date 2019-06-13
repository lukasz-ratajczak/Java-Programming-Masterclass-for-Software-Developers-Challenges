import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define number of elements: ");
        int numberOfElements = scanner.nextInt();
        System.out.println("Define all elements: ");
        int[] inputArray = getIntegers(numberOfElements);
        System.out.println("Input:");
        System.out.println(Arrays.toString(inputArray));

        int[] reverseArray = reverseArray(inputArray);
        System.out.println("Reverse:");
        System.out.println(Arrays.toString(reverseArray));

    }

    public static int[] reverseArray(int[] inputArray) {

        int[] reverseArray = new int[inputArray.length];
        int[] tempArray = new int[reverseArray.length];


        for (int i = 0; i <= inputArray.length / 2; i++) {
            tempArray[i] = inputArray[i];
            reverseArray[i] = inputArray[reverseArray.length - i - 1];
            reverseArray[reverseArray.length - i - 1] = tempArray[i];
        }


        return reverseArray;
    }

    public static void printArray(int[] arrayToPrint) {
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
