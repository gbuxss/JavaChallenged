package MethodChallenges;

import java.util.Scanner;

public class BarkingDog {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ture/false for barking dog: ");
        boolean barking = input.nextBoolean();
        System.out.println("Enter hours: ");
        int hours = input.nextInt();
        boolean result= shouldWakeUp(barking, hours);
        System.out.println(result);
        input.close();

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else return barking && (hourOfDay < 8 || hourOfDay > 22);

    }
}
