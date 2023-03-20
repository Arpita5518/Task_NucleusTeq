import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        BufferedReader readfile  = new BufferedReader(new FileReader("filewriter1.txt"));
            String line;
            while((line = readfile.readLine()) != null)    
            System.out.println(line);
            readfile.close();
    }
}
