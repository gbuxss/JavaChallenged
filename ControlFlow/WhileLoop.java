package ControlFlow;

public class WhileLoop {

    public static void main(String[] args) {

        int rangeStart = 5;
        int count = 0;
        while (rangeStart <= 20) {

            if (isEvenNumber(rangeStart)) {
                System.out.println("Even number: " + rangeStart);
                count++;
            }
            rangeStart++;
            if (count >= 5){
                break;
            }


        }
        System.out.println("total number count is : "+ count);

    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }


}
