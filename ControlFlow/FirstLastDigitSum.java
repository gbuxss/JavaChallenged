package ControlFlow;

public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number <0)
            return -1;
        int lastDigit = number % 10;

        int original = number;
        int reverse = 0;
        while (original != 0) {

            int remainder = original % 10;
            original = original / 10;
            reverse = (reverse * 10) + remainder;

        }

        int firstDigit = reverse % 10;

        return lastDigit + firstDigit;

    }
}
