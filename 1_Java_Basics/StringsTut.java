// Strings in Java are sequences of characters, with each character being stored as 16 bits (2 bytes) using Unicode encoding. 


public class StringsTut {
    
    public static void main(String[] args) {

        //1.)Creating a String in Java

        String s = new String("Example");
        System.out.println(s);

        // 2.) Ways of creating a Java String:

        // a.) String Literal
        // String literals are stored in the String Constant Pool,If the string is already present in the pool, it is reused to save memory.
        String s1 = "ExampleString";
        System.out.println(s1); 

        // b.) New Keyword
        // This creates a new String object in heap memory, even if a similar string exists in the pool.This can cause memory inefficiency.
        String s2 = new String("AnotherExample");
        System.out.println(s2); 

        // Comparing the two methods:
        // When using string literals, the String Constant Pool ensures that identical strings, are stored only once. In contrast, using the 'new' keyword creates new objects in heap memory.
        
        // Interning strings to reduce memory usage.
        String s3 = "ExampleString"; 
        System.out.println("s1 == s3: " + (s1 == s3)); // true because both refer to the same object in the pool.

        // 'new' keyword creates a new object, so this comparison will be false.
        String s4 = new String("AnotherExample");
        System.out.println("s2 == s4: " + (s2 == s4)); 

        // The 'intern()' method moves strings into the String Constant Pool.
        s2 = s2.intern();
        s4 = s4.intern();
        // After interning, s2 and s4 refer to the same object in the pool.
        System.out.println("After interning, s2 == s4: " + (s2 == s4)); // true 



        //  [Why are Java Strings immutable?]
        // Java strings are immutable to ensure that they can be safely shared between multiple threads.
        // This helps avoid security issues and makes strings reliable for use in the String Pool,
        // reducing memory consumption. Also, immutable objects can be cached and reused, improving performance.




        // 3.) Using the concat() Method
        //concat() does not modify the original strings, as they are immutable. A new string is created.

        String str1 = "Hello";
        String str2 = " World!";
        String str3 = str1.concat(str2); 
        System.out.println(str3); 
        
        
        // 4.) String Class in Java
        // The String class in Java provides a variety of methods for string manipulation like:
        // - length(): Returns the length of the string.
        // - charAt(index): Returns the character at the specified index.
        // - substring(beginIndex, endIndex): Returns a substring.
        // - equals(): Compares two strings for equality.
        // - toUpperCase(), toLowerCase(): Converts the string to uppercase or lowercase.
        // - replace(oldChar, newChar): Replaces characters in the string.
        
        String str4 = "Java";
        System.out.println(str4.length()); 
        System.out.println(str4.charAt(2)); 
        System.out.println(str4.substring(1, 3)); 
        System.out.println(str4.equals("Java")); 
        System.out.println(str4.toUpperCase()); 

        // 5.) StringBuffer Class
        // StringBuffer is used when a mutable sequence of characters is required.
        // Unlike strings, StringBuffer objects can be modified directly.
        

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java"); // Modifies the original string, no new object is created.
        System.out.println(sb); 
        
        sb.reverse(); 
        System.out.println(sb); 

        // 6.) StringBuilder Class
        // StringBuilder is similar to StringBuffer, but it is not synchronized.
        // StringBuilder is faster than StringBuffer and is recommended for single-threaded applications, when frequent string modifications are required.

        StringBuilder sbuilder = new StringBuilder("Hello");
        sbuilder.append(" World");
        System.out.println(sbuilder); 

        sbuilder.reverse();
        System.out.println(sbuilder);

        // 7.) String vs StringBuilder vs StringBuffer
        // - String: Immutable, slower for frequent modifications due to object creation.
        // - StringBuilder: Mutable, not thread-safe, faster for single-threaded use cases.
        // - StringBuffer: Mutable, thread-safe, but slower than StringBuilder due to synchronization.
        
        String str5 = "Test";
        StringBuilder sb2 = new StringBuilder("Test");
        StringBuffer sb3 = new StringBuffer("Test");
        
        System.out.println(str5.equals(sb2.toString())); // true
        System.out.println(sb2.equals(sb3)); // false because StringBuilder and StringBuffer are different classes.
        
        
    }
}
  