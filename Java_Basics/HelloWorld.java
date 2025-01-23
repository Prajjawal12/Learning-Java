package Java_Basics;

public class HelloWorld {
    // public is the access specifier which means the method is visible to all
    // static keyword ensures that the method can be invoked without instantiating the class
    // void is the return type
    // args represent command line arguments
    public static void main(String[] args) {
        System.out.println("Hello World\n");
    }
}

// Few Important Terms:
/*
   JDK (Java Development Kit):
   - The JDK is a software development environment used for developing Java applications and applets.
   - It includes the Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (javac),
     an archiver (jar), a documentation generator (Javadoc) and other tools needed in Java development.

   JVM (Java Virtual Machine):
   - The JVM is an engine that provides a runtime environment to drive the Java Code or applications.
   - It converts Java bytecode into machine language and is a part of the Java Run Environment (JRE).

   JRE (Java Runtime Environment):
   - JRE is a part of the Java Development Kit (JDK). It includes the Java Virtual Machine (JVM),
     core classes, and supporting libraries. JRE is responsible for providing the runtime environment
     in which Java bytecode can be executed.
 */

/*
 * Command to compile and run a java code:
 * Compile the code using:
 *   javac HelloWorld.java
 * 
 * This command compiles the HelloWorld.java file and generates a HelloWorld.class file that contains
 * the bytecode corresponding to the source code.
 * 
 * Run the compiled class file using:
 *   java HelloWorld
 * 
 * This command will execute the HelloWorld class file, and you should see the output "Hello World".
 */