package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> bingoPool = new ArrayList<>(75);

        int start = 1;

        //create labels for each character in BINGO with B=15, I=30 and so on, each character holds 15 numbers
        //First loop is looping through BINGO character
        //second loop is looping through number (assigning first fifteen numbers)
        for (char c : "BINGO".toCharArray()) {
            for (int i = start; i < (start + 15); i++) {
                bingoPool.add("" + c + i);
                //System.out.println("" + c + i);
            }
          start += 15;
        }
       // shuffling the list with shuffle method of Collections class and getting first fifteen elements
        Collections.shuffle(bingoPool);
        for (int i = 0; i < 15; i++) {
            System.out.println(bingoPool.get(i));
        }

        System.out.println("-".repeat(50));

        bingoPool.stream()
                .limit(15)
                .filter(s -> s.indexOf('G') == 0 || s.indexOf('O') == 0)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted()
                .forEach(s -> System.out.print(s + " " ));

    }
}
