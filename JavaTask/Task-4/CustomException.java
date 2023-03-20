import java.util.Scanner;
class MyException extends Exception{
    public MyException(String message) {
      super(message);
    }

}
public class CustomException {
    public static void main(String[] args) throws MyException{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First No. : ");
        int a = sc.nextInt();
        System.out.print("Enter Second No. : ");
        int b = sc.nextInt(); 
        int ans=0; sc.close();
        try{ 
            if(b == 0) throw new MyException("b can't be zero");        
            ans = a/b;
            if(ans == 0) 
            throw new MyException("This is default value of ans : "+ ans); 
            else  
            System.out.println(ans); 
        }catch(MyException e){
            System.out.println(e.getMessage());
        }      
    }
}
