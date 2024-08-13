package MethodChallenges;

/****
 * Program to check number is positive, negative or zero based on user input

 *****/
public class CheckNumber {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-9);
        checkNumber(0);
    }


    //method to check number condition
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");

        } else if (number < 0) {
            System.out.println("negative");

        } else {
            System.out.println("zero");
        }
    }
}
