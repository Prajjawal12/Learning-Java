import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        try {
            File fo = new File("new-file.txt");
            fo.createNewFile();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }


        //Writing to newly created file
        try(FileWriter fw = new FileWriter("new-file.txt")){
            fw.write("We are writing this sentence into the new file!");
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        //Reading from newly created file
        try(BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))) {
            String letters = br.readLine();

            System.out.println("Content read from file is: " + letters);
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }

        //Deleting the newly created file
        File fileToDelete = new File("new-file.txt");
        if(fileToDelete.delete()) {
            System.out.println("File deleted succesfully!");
        }else {
            System.out.println("There was some error trying to delete the file!");
        }
    }
}
