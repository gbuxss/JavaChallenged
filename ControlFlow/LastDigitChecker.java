package ControlFlow;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){

        if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber))
            return false;


        int lasDigitOfFirstNumber = firstNumber % 10;
        int lasDigitOfSecondNumber = secondNumber % 10;
        int lasDigitOfThirdNumber = thirdNumber % 10;

        return ((lasDigitOfFirstNumber == lasDigitOfSecondNumber) || (lasDigitOfSecondNumber == lasDigitOfThirdNumber) || (lasDigitOfThirdNumber == lasDigitOfFirstNumber));
    }

    public static boolean isValid(int number){

        return ((number >= 10) && (number <= 1000));
    }

    public static void main(String[] args){

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));

        System.out.println(hasSameLastDigit(15, 468, 105));
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (9, 99, 999));
        System.out.println(hasSameLastDigit (23, 24, 35));





    }

}
