package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMain {

    public static LinkedList<Place> places = new LinkedList<>();
    public static void main(String[] args) {
        Place adelaide = new Place("Adelaide", 1374);
        addPlaces(places, adelaide);
        System.out.println(places);


       // inputActions();
    }


    public static void lineSeparator() {
        System.out.println("-".repeat(50));
    }

    public static void displayItems() {
        lineSeparator();
        String options = """
                Available Actions (Select word or letter)
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """;
        System.out.println(options);
        lineSeparator();
    }

    public static void inputActions() {

        boolean flag = true;


        while (flag) {
            displayItems();
            Scanner sc = new Scanner(System.in);
            String inputText = sc.nextLine().toLowerCase();
            switch (inputText) {
                case "f", "forward" -> System.out.println("This is forward");
                case "b", "backward" -> System.out.println("This is backward");
                case "l", "list places" -> System.out.println("List places");
                case "m", "menu" -> inputActions();
                case "q", "quit" -> {
                    System.out.println("Shutting down . . .");
                    flag = false;
                }
                default -> System.out.println("Invalid input");
            }


        }
    }

    public static void addPlaces(LinkedList<Place> list, Place town){
        if(list.contains(town)){
            System.out.println("Found duplicates: " + town);
            return;
        }
        list.add(town);
    }
}
