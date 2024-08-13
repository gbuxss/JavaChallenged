package MethodChallenges;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeap = isLeap(year);
        if (isLeap) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        sc.close();

    }

    public static boolean isLeap(int year) {

        if (year <= 1 || year >= 9999)
            return false;

        if (year % 4 == 0) {//the year is evenly divisible ny 4, goto next step

            if (year % 100 != 0) {
                return true;
            } else {
                return year % 400 == 0;
            }

        } else {
            return false;
        }
    }
}
