package Java17Features.SealedClassesTut;

public class Main {
  // A sealed class restricts which other classes or interfaces can extend it.
  // This feature provides us control over the class hierarchy.

  public static void main(String[] args) {
    System.out.println("Sealed Class Example:");

    Shape shape1 = new Circle(5);
    Shape shape2 = new Rectangle(4, 6);
    Shape shape3 = new Square(4);

    System.out.println("Circle Area: " + shape1.area());
    System.out.println("Rectangle Area: " + shape2.area());
    System.out.println("Square Area: " + shape3.area());
  }
}

// Sealed class `Shape` with permitted subclasses
// Here, we define a sealed class called `Shape`. By marking it as sealed, we
// control which other classes can extend it.
// We use the `permits` keyword to explicitly list the allowed subclasses:
sealed abstract class Shape permits Circle, Rectangle, Square {

  // All subclasses must provide their implementation of this method.
  public abstract double area();
}

// `Circle` is a subclass of `Shape` that is marked as `final`.
// This means no other class can extend `Circle`.

final class Circle extends Shape {
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}

final class Rectangle extends Shape {
  private final double length;
  private final double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double area() {
    return length * width;
  }
}

// `Square` is a subclass of `Shape`, but we have marked it as `non-sealed`.
// This means other classes can still extend `Square` if needed.

non-sealed class Square extends Shape {
  private final double sideLength;

  public Square(double sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public double area() {
    return sideLength * sideLength;
  }
}
