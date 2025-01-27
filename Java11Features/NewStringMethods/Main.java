package Java11Features.NewStringMethods;

public class Main {

  // 1. Introduction to New String Methods in Java 11
  // Java 11 introduced several new methods in the String class to simplify common
  // string operations.
  // These methods handle tasks like checking for blank strings, repeating
  // strings, and working with multiline data.
  // The methods aim to make string operations more concise, efficient, and
  // readable.

  public static void main(String[] args) {

    // 2. isBlank() Method - Checks if the string is empty or contains only
    // whitespace characters
    // The method returns true if the string is either empty or consists only of
    // whitespace characters.
    // It is a more concise alternative to `trim().isEmpty()`.

    String str1 = "";
    String str2 = "   ";
    String str3 = "Java";

    System.out.println("isBlank() Results:");
    System.out.println(str1.isBlank());
    System.out.println(str2.isBlank());
    System.out.println(str3.isBlank());

    System.out.println();

    // 3. lines() Method - Splits a string into a Stream of lines separated by line
    // terminators
    // This method is useful for processing multiline strings, converting them into
    // streams for further processing.

    String multiline = "Java\nPython\nC++";

    System.out.println("lines() Method:");
    multiline.lines().forEach(System.out::println);

    System.out.println();

    // 4. repeat(int count) Method - Repeats the string a given number of times
    // This method returns a new string that repeats the original string the
    // specified number of times.

    String str = "Java ";
    System.out.println("repeat() Method:");
    System.out.println(str.repeat(3));
    System.out.println();

    // 5. strip(), stripLeading(), stripTrailing() Methods
    // strip() removes all leading and trailing whitespace (Unicode spaces).
    // stripLeading() removes only leading whitespace.
    // stripTrailing() removes only trailing whitespace.

    String text = "\u2003  Java  \n";
    System.out.println("strip() Method:");
    System.out.println(text.strip());
    System.out.println("stripLeading() Method:");
    System.out.println(text.stripLeading());
    System.out.println("stripTrailing() Method:");
    System.out.println(text.stripTrailing());

    System.out.println();

    // 6. stripIndent() Method - Strips common leading whitespace from all lines of
    // a multiline string
    // This is often used with text blocks (introduced in Java 13) but works in Java
    // 11 as well.

    String indentText = "    Line 1\n    Line 2\n    Line 3";
    System.out.println("stripIndent() Method:");
    System.out.println(indentText.stripIndent());

    System.out.println();

    // 7. transform(Function<? super String, ? extends R> function) Method -
    // Transforms the string using a provided function
    // This method allows for functional-style transformations of the string and
    // returns the result.

    String transformed = str.transform(s -> s + "is powerful!");
    System.out.println("transform() Method:");
    System.out.println(transformed);

    System.out.println();

    // Combining Methods for Advanced Processing

    // Using `lines()`, `isBlank()`, and `strip()` together:
    String complexText = "   Java is\n\n powerful!\n";
    System.out.println("Combining Methods:");
    complexText.lines()
        .filter(line -> !line.isBlank())
        .map(String::strip)
        .forEach(System.out::println);

    System.out.println();

  }
}
