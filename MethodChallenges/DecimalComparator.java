package MethodChallenges;

import java.util.Scanner;

public class DecimalComparator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        boolean result = areEqualByThreeDecimalPlaces(num1, num2);
        if (result) {
            System.out.println("The two numbers are equal");
        } else {
            System.out.println("The two numbers are not equal");
        }

        sc.close();
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        long firstRoundedNumber = (long) (firstNumber * Math.pow(10, 3));
        long secondRoundedNumber = (long) (secondNumber * Math.pow(10, 3));
        return firstRoundedNumber == secondRoundedNumber;
    }
}

