package Java8Features.StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    // Creating a stream from a list of names
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
    names.stream()
        .map(String::toUpperCase) // Convert each name to uppercase
        .forEach(System.out::println); // Print each name

    System.out.println();

    // Creating a stream of integers
    Stream<Integer> numbers = Stream.of(4, 6, 1, 3, 2, 8);

    // Using intermediate operation: filter even numbers
    numbers.filter(n -> n % 2 == 0)
        .forEach(System.out::println); // Print each even number

    System.out.println();

    // Using sorted operation to sort numbers in descending order
    Stream<Integer> sortedNumbers = Stream.of(4, 6, 1, 3, 2, 8);
    sortedNumbers.sorted((a, b) -> b - a)
        .forEach(System.out::println); // Print sorted numbers

    System.out.println();

    // Using terminal operation: collecting odd numbers into a list
    List<Integer> oddNumbers = Stream.of(4, 6, 1, 3, 2, 8)
        .filter(n -> n % 2 != 0)
        .collect(Collectors.toList());
    System.out.println(oddNumbers);

    // Using count operation to count even numbers
    long evenCount = Stream.of(4, 6, 1, 3, 2, 8)
        .filter(n -> n % 2 == 0)
        .count();
    System.out.println("Count of even numbers: " + evenCount);

    // Using reduce operation to find the maximum number
    long maxNumber = Stream.of(11, 12, 13, 14, 15)
        .reduce(0, Integer::max);
    System.out.println("Maximum number: " + maxNumber);
  }
}
/*
 * Pros:-
 * Concise code, improved readability, lazy evaluation , supports parallelism
 *
 * Cons:-
 * Memory Overhead , Limitaion in resuability
 */