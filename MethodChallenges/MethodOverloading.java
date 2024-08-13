package MethodChallenges;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println(convertToCentimeter(5,7));
        System.out.println(convertToCentimeter(6));

        System.out.println(getDurationString(55));
        System.out.println(getDurationString(66, 55));

        System .out.println(area(5.00));
        System .out.println(area(-1));
        System .out.println(area(5, 4.00));
        System .out.println(area(-5, 4.00));
    }

    public static double convertToCentimeter(int heightInInch) {

        return heightInInch * 2.54;
    }

    public static double convertToCentimeter(int heightInFeet, int heightInInch) {

        double convertedInches = (heightInFeet * 12) + heightInInch;
        return convertToCentimeter((int) convertedInches);
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid duration";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return (getDurationString(minutes, remainingSeconds));

    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0) {
            return "Invalid duration";
        }
        //convert excess seconds to minutes

        minutes += seconds / 60;
        seconds = seconds % 60;

        //convert excess minutes to hours

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;


        return (hours + "h " + remainingMinutes + "m " + seconds + "s");
    }

    public static double area (double radius){
        if (radius < 0)
            return -1.0;
        double PI = 3.14159265359;

        return PI * radius * radius;
    }

    public static double area (double x, double y){
        if (x < 0 || y <0)
            return -1.0;
        return x * y;
    }
}
