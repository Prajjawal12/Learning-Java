package Exception_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//In Java 7, try with resources statement was introduced,these resources implement AutoCloseable interface and hence we don't need to 
//close them using a finally block
public class TryWithResources {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("a.txt"))){
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
