import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//A program that creates a new file and writes some text to it.
public class CreateFile {
    public static void main(String[] args) throws IOException{      
            PrintWriter file1 = new PrintWriter(new FileWriter("filewriter1.txt",true));//This tells the FileWriter to append text to the file rather than overwriting it.
            file1.println("It is my first file");
            file1.close();
            System.out.println("File sucessfully created..");
    }
}
