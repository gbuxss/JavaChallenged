package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BingoStreams {

    public static void main(String[] args) {

        List<Integer> bNumbers = new ArrayList<Integer>(
                List.of( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 ) );
        var bStream = bNumbers
                .stream()
                .map(i -> ("B-" + i));

        int[] iNumbers = new int[15];
        Arrays.setAll(iNumbers, i -> 16 + i);
        var iStream = Arrays.stream(iNumbers)
                .mapToObj(i -> ("I-" + i));

        var nStream = Stream.iterate(31, i -> i + 1)
                .limit(15)
                .map(i -> ("N-" + i));

        var gStream = Stream.generate(() -> "G-")
                .limit(15)
                .map(s -> s + (nextGVal++));

        var oStream = IntStream.rangeClosed(61, 75)
                .mapToObj(i -> ("O-" + i));

        var bi = Stream.concat(bStream, iStream);
        var bin = Stream.concat(bi, nStream);
        var bing = Stream.concat(bin, gStream);
        var bingo = Stream.concat(bing, oStream);

        bingo.forEach(System.out::println);
    }

    static int nextGVal = 45;
}



