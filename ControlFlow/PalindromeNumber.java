package ControlFlow;

public class PalindromeNumber {

    public static void main (String[] args){

        System.out.println("The number is "+ isPalindrome(-45));
    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int original = number;
        while(original != 0){
            int remainder = original % 10 ;
            original = original / 10;
            reverse = (reverse * 10) + remainder;
        }

        return (number == reverse);

    }
}
