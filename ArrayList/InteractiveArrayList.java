package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class InteractiveArrayList {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> groceriesItems = new ArrayList<>();

    public static void main(String[] args) {
        performAction();
    }

    public static void sineSeparator(){
        System.out.println("-".repeat(50));
    }

    public static void performAction() {

        boolean flag = true;
        while (flag) {
            displayMenu();
            try{
                int receivedInput = Integer.parseInt(sc.nextLine());
                switch (receivedInput) {
                    case 0 -> {
                        System.out.println("Shutting down . . .");
                        flag = false;
                    }
                    case 1 -> addItems();
                    case 2 -> removeItems();
                    default -> System.out.println("Invalid input only option 0, 1, 2 are allowed");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid input . Please enter a number");
            }

        }
    }

    public static void displayMenu() {
        sineSeparator();
        System.out.println(
                """
                        Available actions:\s
                        0 - to shutdown
                        1 - to add item(s) to list (comma delimited list)
                        2 - to remove any items (comma delimited list)
                        Enter a number for which action you want to do:\s"""

        );

    }


    public static void addItems() {

        System.out.println("Enter item(s) seperated by ','");
        String[] items = sc.nextLine().split(",");
        for (String item : items) {
            String trimmedItem = item.trim().toUpperCase();
            if (!groceriesItems.contains(trimmedItem)) {
                groceriesItems.add(trimmedItem);
            }else{
                sineSeparator();
                System.out.println(trimmedItem + " is already in the list.");
            }
        }
        sineSeparator();
        System.out.println("Groceries list -> " + groceriesItems);
        groceriesItems.sort(Comparator.naturalOrder());
        sineSeparator();
        System.out.println("Sorted Groceries list -> " + groceriesItems);
    }

    public static void removeItems() {
        sineSeparator();
        System.out.println("Enter item(s) seperated by ','");
        String[] items = sc.nextLine().split(",");

        for(String item: items){
            String trimmedItem= item.trim().toUpperCase();
            if(groceriesItems.contains(trimmedItem)){
                groceriesItems.remove(trimmedItem);
                sineSeparator();
                System.out.println(trimmedItem + " has been removed");
            }else {
                sineSeparator();
                System.out.println(trimmedItem + " is not in the list.");
            }
        }


        System.out.println("Remaining items in the list-> " + groceriesItems);
    }
}
