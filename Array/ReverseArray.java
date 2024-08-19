package Array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        Object[] inputArray = {"jeevan", "pabitra", 1, 5, 0.34};
        System.out.println(Arrays.toString(inputArray));
        System.out.println(Arrays.toString(reverseArray(inputArray)));
    }

    public static Object[] reverseArray(Object[] array) {

        int maxIndex = array.length - 1;

        Object[] reversedArray = new Object[array.length];

        for (Object individualElement : array) {
            reversedArray[maxIndex--] = individualElement;
        }
        return reversedArray;
    }
}
