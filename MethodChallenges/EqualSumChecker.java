package MethodChallenges;

import java.util.Scanner;

public class EqualSumChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        boolean result = hasEqualSum(num1, num2, num3);
        if (result) {
            System.out.println("The sum of first two numbers is equal to third number");
        } else {
            System.out.println("The sum of two numbers is not equal to third number");

        }

        sc.close();

    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {

        return (num1 + num2) == num3;
    }
}
