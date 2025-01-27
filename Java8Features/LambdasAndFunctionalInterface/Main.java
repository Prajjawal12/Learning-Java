package Java8Features.LambdasAndFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
 * Functional Interface
 * Any interface that has only one abstract method is called a functional interface
 *
 * They are designed to be used with lambda expressions and implement Functional Programming
 *
 *Optional Annotation of FunctionalInterface

 built-in functional Interfaces

 1.)Predicate<T> :- boolean valued function
 2.)Function<T,R> :- function
 3.)Consumer<T> :- Represens an operation
 4.)Supplier<T>:- Represent a supplier of information
 5.)BinaryOperator<T> :- represents an operation on operator of same type
 */

/*Lambda Expression */

/*
 * Lambdas are a concise way of representing an anonymous function


 */
public class Main {
  @FunctionalInterface
  interface Calculator {
    int operate(int a, int b);
  }

  public static void main(String[] args) {
    Calculator add = (a, b) -> a + b;
    Calculator multiply = (a, b) -> a + b;
    // 1.)Custom Functional Interface
    System.out.println(add.operate(10, 20));
    System.out.println(multiply.operate(10, 20));

    // 2.)Predicate
    Predicate<Integer> isEven = (a) -> a % 2 == 0;
    System.out.println(isEven.test(10));
    System.out.println(isEven.test(5));

    // 3.)Functional
    Function<String, Integer> stringLength = (str) -> str.length();
    System.out.println(stringLength.apply("hello"));
    System.out.println(stringLength.apply("Test"));

    // 4.)Consumer
    Consumer<String> printMessage = (str) -> System.out.println(str);
    printMessage.accept("hello hello");

    // 5.)Supplier
    Supplier<Double> supplier = () -> Math.random();
    System.out.println(supplier.get());

    // 6)Binary Operators
    BinaryOperator<Integer> subtract = (a, b) -> a - b;
    System.out.println(subtract.apply(10, 2));

    // 7.)Using Lambdas with Stream
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

    names.stream().filter(name -> name.length() > 3).forEach(System.out::println);

  }
}