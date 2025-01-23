package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

//So far we have seen that Exceptions that have occurred were done at runtime, they are known as Unchecked Exceptions
//Now we will see compile time exceptions i.e Checked Exceptions
public class CheckedExceptions {
    public static void method3() throws FileNotFoundException {
        FileReader fr = new FileReader("a.txt");
    }
    public static void method2() throws FileNotFoundException {
        method3();
    }
    //we use throw keyword to throw an object of exception
    public static void main(String[] args) throws FileNotFoundException  {
        try {
            method2();
        } catch (FileNotFoundException e) {
           System.out.println("No file found!!");
           throw new FileNotFoundException(e.getMessage());
        }
    }
}
