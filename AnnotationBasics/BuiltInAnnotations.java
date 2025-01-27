package AnnotationBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// Built-in Java Annotations used in Java code:
// @Override
// @SuppressWarnings
// @Deprecated

public class BuiltInAnnotations {

  // Example of a Deprecated method with a clear use case
  @Deprecated
  public static void oldMethod() {
    System.out.println("This method is deprecated. Use newMethod() instead.");
  }

  public static void newMethod() {
    System.out.println("This is the new and recommended method.");
  }

  // Functional Interface
  @FunctionalInterface
  interface Greeting {
    void sayHello(String name);
  }

  public static void main(String[] args) {
    // 1.) @Override
    // Demonstrating overriding functionality
    // If we don't properly override a method from the parent class, a compile-time
    // error will occur.

    Child child = new Child();
    child.displayMessage(); // Overridden method

    // 2.) @SuppressWarnings
    // Suppresses warnings issued by the compiler for unchecked or other warnings.
    @SuppressWarnings("unchecked")
    List rawList = new ArrayList(); // Using raw type (not recommended)
    rawList.add("Atul");
    rawList.add(123); // Mixing types in a raw type list

    for (Object obj : rawList) {
      System.out.println("List element: " + obj);
    }

    // 3.) @Deprecated
    // This method is marked as deprecated. We should use newMethod instead.
    oldMethod(); // Usage of deprecated method
    newMethod(); // Recommended method

    // 4.) Functional Interface
    // A functional interface is an interface with exactly one abstract method.
    // We can use lambda expressions to provide the implementation of this method.

    Greeting greeting = name -> System.out.println("Hello, " + name + "!");
    greeting.sayHello("Alice");

    // Example of using a built-in functional interface
    Consumer<String> consumer = message -> System.out.println("Message: " + message);
    consumer.accept("This demonstrates a built-in functional interface.");
  }
}

// Parent class
class Parent {
  public void displayMessage() {
    System.out.println("Message from Parent class");
  }
}

// Child class that overrides the displayMessage method
class Child extends Parent {
  @Override
  public void displayMessage() {
    System.out.println("Message from Child class (overridden method)");
  }
}
