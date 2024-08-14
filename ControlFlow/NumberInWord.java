package ControlFlow;

public class NumberInWord {

    public static void printNumberInWord(int number) {

        String numberInWord = switch(number){
            case 1 -> {yield "ONE";}
            case 2 -> {yield "TWO";}
            case 3 -> {yield "THREE";}
            case 4 -> {yield "FOUR";}
            case 5 -> {yield "FIVE";}
            case 6 -> {yield "SIX";}
            case 7 -> {yield "SEVEN";}
            case 8 -> {yield "EIGHT";}
            case 9 -> {yield "NINE";}
            case 0 -> {yield "ZERO";}
            default -> {yield "OTHER";}
        };

        System.out.println(number + " is a " + numberInWord);
    }

    public static void main(String[] args){
        printNumberInWord(1);
    }
}
