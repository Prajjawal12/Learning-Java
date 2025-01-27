package Java17Features.PatternMatchingForSwitch;

public class Main {

  // Pattern Matching for `switch` was introduced as a preview feature in Java 17
  // to enhance the `switch` statement by enabling pattern matching for type
  // checks.
  // Previously, `switch` worked only with constants and exact matches. With
  // pattern matching, we can use types
  // and conditions to match more complex cases, making the code cleaner and more
  // readable.

  public static void main(String[] args) {

    Object shape1 = new Circle(5);
    Object shape2 = new Rectangle(4, 6);
    Object shape3 = "Some string";// a default case.

    System.out.println("Shape Area Calculation using Pattern Matching for Switch:");
    System.out.println("Shape1: " + calculateArea(shape1));
    System.out.println("Shape2: " + calculateArea(shape2));
    System.out.println("Shape3: " + calculateArea(shape3));
  }

  // 2. Pattern Matching in Switch Expressions
  // We define a method `calculateArea` that takes an `Object` and checks its type
  // using a `switch` statement.
  // With pattern matching, we can match objects against specific patterns
  // directly in the `switch` case.

  static double calculateArea(Object shape) {
    return switch (shape) {

      case Circle c -> Math.PI * c.radius * c.radius;

      case Rectangle r -> r.length * r.width;

      case String s -> {
        System.out.println("Not a shape: " + s);
        yield 0;
      }
      // If no match is found, return 0 (this is our fallback case)
      default -> 0;
    };
  }

  // 3. The `switch` with Pattern Matching Syntax
  // In the method `calculateArea`, we use the new `switch` expression syntax with
  // pattern matching.
  // The syntax is simple:
  // - `case <Type> <variable> -> <expression>`: This pattern matches an object of
  // the specified type and binds it to a variable.
  // - If the object matches, the block of code after `->` executes.
  // - `yield` is used to return a value from the `switch` expression.

  static class Circle {
    private final double radius;

    public Circle(double radius) {
      this.radius = radius;
    }

    public double getRadius() {
      return radius;
    }
  }

  static class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
    }

    public double getLength() {
      return length;
    }

    public double getWidth() {
      return width;
    }
  }
}
