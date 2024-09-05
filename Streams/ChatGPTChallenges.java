package Streams;


import java.util.*;
import java.util.stream.Collectors;

public class ChatGPTChallenges {
    public static void main(String[] args) {
        //Challenge 1: Filter and Collect Names
        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Anna", "David");

        List<String> newListWithLetterA = names.stream().filter(x -> x.charAt(0) != 'A').toList();
        System.out.println(newListWithLetterA);

        //Challenge 2: Square the numbers and filter Even Squares

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> newList = numbers.stream().map(x -> x * x).filter(x -> x % 2 == 0).toList();
        System.out.println(newList);

        //Challenge 3: Find the longest String

        List<String> words = Arrays.asList("apple", "banana", "pear", "pineapple", "grape");
        String s = words.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(s);

        //Challenge 4: Sum of Odd Numbers
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int integerStream = numbers2.stream().filter(x -> x % 2 != 0).mapToInt(Integer::intValue).sum();

        System.out.println(integerStream);

        //Challenge 5: Count Distinct words by length

        List<String> words2 = Arrays.asList("cat", "dog", "elephant", "tiger", "lion", "cat", "tiger");
        long count = words.stream().map(String::length).distinct().count();
        System.out.println(count);

        //Challenge 6: Group words by length
        List<String> words3 = Arrays.asList("apple", "bat", "banana", "kiwi", "cherry", "date", "fig");
        Map<Integer, List<String>> collect = words3.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

        Optional<Integer> secondLargestNumber = getSecondLargestNumber();
        secondLargestNumber.ifPresentOrElse(System.out::println, () -> System.out.println("No second largest Number"));

        //Challenge 8: Flatten a List of Lists
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> collect1 = listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect1);
    }

    public static Optional<Integer> getSecondLargestNumber() {
        //Challenge 7: Find the second-largest Number
        List<Integer> numbers3 = Arrays.asList(5, 5, 8, 5, 10, 5, 5);
       return numbers3.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }
}

