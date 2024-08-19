package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InteractiveArray {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of an array: ");
        int sizeOfArray = sc.nextInt();
        int[] myArray = getIntegers(sizeOfArray);
        printArray(myArray);
        sortIntegers(myArray);
    }

    public static int[] getIntegers(int sizeOfArray) {
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray ; i++) {
            System.out.println("Enter the " + i + " element:");
            array[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(array)); uncomment this to see array for debugging
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("\n");
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static void sortIntegers(int[] array){
        System.out.println("\n");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
