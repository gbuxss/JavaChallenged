package MethodChallenges;

import java.util.Scanner;

public class MegaBytesConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of KiloBytes: ");
        int kiloBytes = input.nextInt();
        printMegaBytesAndKiloBytes(kiloBytes);
        input.close();
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0 ) {

            System.out.println("Invalid Value");
        }else {

            int kilobytes = kiloBytes % 1024;
            int megabytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytes + " KB");
        }
    }
}
