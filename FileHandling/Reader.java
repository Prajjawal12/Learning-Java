package FileHandling;

// Streams mean sequence of data
//The sequence of data can be either bytes or characters(in unicode format)
//Streams are an abstraction that is provided by Java
//Java implements streams through class hierarchies defined within java.io
//Streams in Java are of two types
//1.)Byte Stream  ---> binary data like image etc.
// These are defined in two class hierarchies namely Input Stream and Output Stream

//2.)Character Stream ---> 
//These are also defined in two class hierarchies namely Reader and Writer


//IOException
//Predefined Streams in Java
//Buffered Reader
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reader {
    public static void main(String[]  args) {
        // try(InputStreamReader isr = new InputStreamReader(System.in)) {
        //         System.out.println("Enter the characters!");
        //         int letters = isr.read();
        //         while(isr.ready()) {
        //             System.out.println((char) letters);
        //             letters = isr.read();
        //         }
        // }catch(IOException e) {
        //     System.out.println(e.getMessage());
        // }


        // try(FileReader fr = new FileReader("text.txt")) {
        //     int letters = fr.read();

        //     while(fr.ready()) {
        //         System.out.print((char) letters);
        //         letters = fr.read();
        //     }
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }
        //Buffered Reader 
//converts byte stream into char stream
//reading the character stream
//byte -> char ---> reading char stream
//we can also use FileReader instead of InputStream
try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
    String letters = br.readLine();
    System.out.print("You typed " + letters);
  }catch(IOException e){
      System.out.println(e.getMessage());
  }
    System.out.println();
    try(BufferedReader br = new BufferedReader(new FileReader("text.txt"))){
        while(br.ready()) {
           System.out.println( br.readLine());
        }
    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }

    }

}
