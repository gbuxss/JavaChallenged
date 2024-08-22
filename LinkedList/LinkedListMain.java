package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMain {

    public static LinkedList<Place> places = new LinkedList<>();
    public static void main(String[] args) {
        Place adelaide = new Place("Adelaide", 1374);
        Place brisbane = new Place("brisbane", 917);
        Place perth = new Place("perth", 3923);
        Place AliceSpring = new Place("Alice Spring", 2771);
        Place darwin = new Place("Darwin", 3974);
        Place sydney = new Place("Sydney", 0);
        addPlaces(places, adelaide);
        addPlaces(places, brisbane);
        addPlaces(places, perth);
        addPlaces(places, AliceSpring);
        addPlaces(places, darwin);
        addPlaces(places, sydney);
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

        for (Place p : list){
            if(p.getTown().equalsIgnoreCase(town.getTown())){
                System.out.println("Found duplicates: " + town);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listItem : list) {
            if(town.getDistance() < listItem.getDistance()){
                list.add(matchedIndex, town);
                return;
            }
            matchedIndex++;
        }
        list.add(town);
    }
}
