package MethodChallenges;

public class MethodOverloading {

    public static void main(String[] args) {

        //System.out.println(convertToCentimeter(5,7));
        //System.out.println(convertToCentimeter(6));

        System.out.println(getDurationString(67));
        System.out.println(getDurationString(66, 67));
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
}
