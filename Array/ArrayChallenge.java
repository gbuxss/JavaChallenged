package Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public static void main(String[] args) {

        int[] ranArray = randomIntArrays(5);
        System.out.println("Unsorted Array-> " + Arrays.toString(ranArray));
        Arrays.sort(ranArray);
        System.out.println("Sorted Array-> " + Arrays.toString(ranArray));

        int[] descSorted = sortedDescArray(ranArray);
        System.out.println("Desc Sorted Array-> " +Arrays.toString(descSorted));

    }


    public static int[] randomIntArrays(int length) {

        Random ran = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = ran.nextInt(100);
        }
        return array;
    }

    public static int[] sortedDescArray(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    //System.out.println(Arrays.toString(sortedArray)); uncomment this line to see action step by step 
                }
            }

        }
        return sortedArray;
    }
}
