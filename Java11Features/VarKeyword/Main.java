package Java11Features.VarKeyword;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    // var keyword was introduced in java 10 to modernise the language while
    // maintaining the strong typed nature
    // It allows local variable type inference which means the compiler can infer
    // the type of the variable based on the initializer

    Map<String, List<String>> map = new HashMap<>();
    // The type information(Map<String, List<String>>) is repeated twice here which
    // affects readability and could lead to error in complex scenarios

    // uing var keyword we can declare a local variable without specifying ti's type
    // explicitly

    // syntax var variableName = initializer

    var name = "Prajjawal"; // inferred as String
    var age = 10; // inferred as int
    var price = 12.23; // inferred as float
    // var map = new HashMap<>(); // inferred as Hashmap for type
    // Hashmap<Object,Object>

    /* Rules for using var */

    // Initializer is mandatory
    // var x ; Error: Cannot infer type for local variable

    // Cannot be null wihtout a type
    // var name = null; //Error: Cannot infer type

    // Limited to local variables
    // var can only be used for
    // local variables inside methods
    // loop variables in for and for each
    // Lambda expressions
    // public class Example {
    // var field = "Not allowed"; // Error: Cannot use var for fields
    // }

    // No reassignment with different type
    var message1 = "Message";
    message1 = (String) 1;

    /* Advantages */
    // Reduces Boilerplate code
    Map<String, List<String>> list = new HashMap<>();
    var map1 = new HashMap<String, List<String>>();

    /*
     * Improves readability: In many cases, it makes the code cleaner and easier to
     * read by focusing on the variable's name and purpose rather than its type.
     *
     * Type-safe: The type is inferred at compile time, ensuring that the program
     * remains type-safe. This is not dynamic typing like in languages such as
     * Python or JavaScript.
     *
     * Encourages less verbose, modern coding styles: It’s in line with modern
     * programming languages like Kotlin, Scala, and TypeScript that have similar
     * features.
     */

    /* Limitations */
    // 1.)Reduced Explicitness
    // While var makes code concise, it can sometimes make the type unclear to the
    // reader, especially if the initializer is a complex expression.
    var res = someMethod(); // what is the type of this method?

    // Less useful for APIs: Since var only works for local variables, it doesn’t
    // apply to fields, method parameters, or return types.

    // Cannot be used in compound declarations: You cannot declare multiple
    // variables with var in the same statement.
    var a = 1, b = 2; // Error

    // Examples
    // 1.)Local Variable Declaration
    List<String> list12 = new ArrayList<>();

    var list13 = new ArrayList<String>();

    // 2)Uing var in loops
    for (var i = 0; i < 1000; i++) {
      // do something
    }

    for (var x : list12) {
      // do something
    }

    // 3.)Working with Streams
    var list14 = List.of("Apple", "Bananas");
    var stream = list14.stream().filter(s -> s.startsWith("A"));

    // 4.)Type safe inference
    var hmap = new HashMap<String, List<Integer>>();
    hmap.put("keyword", List.of(1, 2, 3));
  }

}
