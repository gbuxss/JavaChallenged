package ControlFlow;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if (year <= 1 || year >= 9999)
            return false;

        if (year % 4 == 0) { //check first condition to see if year is divisible by 4, if yes, check for if year is divisible by 100
            if (year % 100 != 0) { // if year is not divisible by 100 , it is leap year , return true , else goto next step to check if divisible by 400
                return true;
            } else {
                if (year % 400 == 0) {// if year is divisible by 400 it is leap year return true, else return false
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false; // if year is not divisible by 4 return false
        }

    }

    public static int getDaysInMonth(int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year > 9999))
            return -1;

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31; //for these months return 31 days
            case 2 -> isLeapYear(year) ? 29 : 28; // for Feb, check if it is leap year , if it's leap year return 29 else return 28
            case 4, 6, 9, 11 -> 30; // for these months return 30 days
            default -> -1; // if the year is not between 1- 12 return -1
        };
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(12,10000));

    }

}



