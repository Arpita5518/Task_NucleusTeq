import java.io.FileNotFoundException;
import java.util.Scanner;
public class ThrowAndThrows {
    public static int getStringLength(String str){
        if(str  == "")
        throw new NullPointerException("String can't be null");
        return str.length();
    }
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String str = sc.nextLine();  
        try{  
        int length = getStringLength(str);   
        System.out.println("String Length is : " + length);
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        Class.forName("ThrowAndThrows");
        System.out.println("Class is present");
        sc.close();
    }
    
}
