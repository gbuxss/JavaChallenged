package ControlFlow;

public class EvenDigitSum {

    //program to sum the even digits from the provided number
    //getEvenDigitSum(123456789) -> should return 20 since, 2+ 4+ 6+ 8 =20

    public static void main(String[] args){
       System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number){

        if (number < 0)
            return -1;

        int sum = 0;

        while (number != 0){
            int remainder = number % 10;
            if (remainder % 2 == 0)
                sum = sum +remainder;

            number = number / 10;
        }

        return sum;
    }
}
