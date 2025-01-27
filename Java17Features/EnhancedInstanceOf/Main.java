package Java17Features.EnhancedInstanceOf;

public class Main {

  // Enhanced `instanceof` is a feature introduced in Java 17 that allows a more
  // concise and expressive way
  // of performing type checks and casting in one step. Before Java 17, using
  // `instanceof` required a separate cast
  // after the check. With enhanced `instanceof`, the cast is done automatically
  // when the type matches, improving both readability and safety.
  //
  // The enhanced version removes the need for redundant casting by automatically
  // introducing a local variable
  // with the correct type if the check passes.
  public static void main(String[] args) {
    Object obj1 = new Circle(5);
    Object obj2 = new Rectangle(4, 6);
    Object obj3 = "Some string"; // A non-shape object

    System.out.println("Shape Area Calculation using Enhanced instanceof:");
    System.out.println("Object 1: " + calculateArea(obj1));
    System.out.println("Object 2: " + calculateArea(obj2));
    System.out.println("Object 3: " + calculateArea(obj3));
  }

  // The syntax is:
  // `if (object instanceof Type variable)` – if the object is an instance of the
  // specified `Type`, the `variable` gets the casted value.

  static double calculateArea(Object shape) {
    // Checks if `shape` is a Circle and automatically casts it to `Circle`
    if (shape instanceof Circle circle) {
      return Math.PI * circle.getRadius() * circle.getRadius();
      // Checks if `shape` is a Rectangle and automatically casts it to
      // `Rectangle`
    } else if (shape instanceof Rectangle rectangle) {
      return rectangle.getLength() * rectangle.getWidth();
    } else if (shape instanceof String s) {
      System.out.println("Not a shape: " + s);
      return 0;
    } else {
      return 0;
    }
  }

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
