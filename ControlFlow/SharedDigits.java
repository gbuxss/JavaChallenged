package ControlFlow;

public class SharedDigits {

    public static void main(String[] args){
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber){

        if ((firstNumber < 11 || firstNumber > 100) || (secondNumber < 11 || secondNumber > 100))
            return false;

        //extract digits from firstNumber

        int lastDigitOfFirstNumber = firstNumber % 10;
        int firstDigitOfFirstNumber = firstNumber / 10;

        int lastDigitOfSecondNumber = secondNumber % 10;
        int firstDigitOfSecondNumber = secondNumber / 10;

        if((firstDigitOfFirstNumber == firstDigitOfSecondNumber) || (firstDigitOfFirstNumber == lastDigitOfSecondNumber) )
            return true;

        return (lastDigitOfFirstNumber == firstDigitOfSecondNumber) || (lastDigitOfFirstNumber == lastDigitOfSecondNumber);
    }
}
