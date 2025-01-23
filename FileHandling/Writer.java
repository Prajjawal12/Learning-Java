package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Writer {
   public static void main(String[] args) {
    try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
        osw.write("Hello World");
        osw.write(97);
        osw.write(10);
        osw.write('A');
        osw.write('\n');
        char[] arr = "hello world".toCharArray();
        osw.write(arr);
    } catch(IOException e) {
        System.out.println(e.getMessage());
    }

    try(FileWriter fw = new FileWriter("text.txt", true)){
        fw.write("This is some sample text!");
        fw.write("This text will be appended to already contained text");
    }
    catch(IOException e) {
        System.out.println(e.getMessage());
    }

    try(BufferedWriter bw = new BufferedWriter(new FileWriter("text1.txt"))) {
        bw.write("Toy Story");
    }catch(IOException e) {
        System.out.println(e.getMessage());
    }









   }

   

    
}
