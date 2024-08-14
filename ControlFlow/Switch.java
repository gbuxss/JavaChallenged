package ControlFlow;

public class Switch {

    public static void main(String[] args) {

        char letter = 'A';

        switch (letter) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        printDayOfWeek(4);



    }

    public static void printDayOfWeek ( int day){

        String dayOfWeek= switch (day) {
            case 0 -> {
                yield day + " day is Sunday";
            }
            case 1 -> {
                yield day + " day is Monday";
            }
            case 2 -> {
                yield day + " day is Tuesday";
            }
            case 3 -> {
                yield day + " day is Wednesday";
            }
            case 4 -> {
                yield day + " day is Thursday";
            }
            case 5 -> {
                yield day + " day is Friday";
            }
            case 6 -> {
                yield day + " day is Saturday";
            }
            default -> {
                yield day + " day is Unknown";
            }

        };

        System.out.println(dayOfWeek);
    }
}
