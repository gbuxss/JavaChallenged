package MethodChallenges;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println(convertToCentimeter(5,7));
        System.out.println(convertToCentimeter(6));
    }

    public static double convertToCentimeter(int heightInInch){

        return heightInInch * 2.54;
    }

    public static double convertToCentimeter(int heightInFeet, int heightInInch){

        double convertedInches = (heightInFeet * 12) + heightInInch;
        return convertToCentimeter((int) convertedInches );
    }
}
