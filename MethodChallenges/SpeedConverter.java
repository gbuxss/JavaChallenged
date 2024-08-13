package MethodChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;


public class SpeedConverter {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed: ");
        double speed = input.nextDouble();
        printConversion(speed);
        input.close();

    }

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour <0 )
            return -1;
        else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour){

        if(kilometersPerHour <0 ){
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h" );
        }
    }
}
