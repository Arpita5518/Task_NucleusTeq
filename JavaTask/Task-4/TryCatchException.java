import java.util.Scanner;

public class TryCatchException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First No. : ");
        int a = sc.nextInt();
        System.out.print("Enter Second No. : ");
        int b = sc.nextInt();
        try{
        int ans = a/b;
        String s="";
        System.out.println("division of Two no. :" + ans);
        System.out.println(s.length());
        } catch (ArithmeticException e){
            System.out.println("Error :" + e.getMessage());
        } catch(NullPointerException e){
            System.out.println("Error :" + e);
        } catch(Exception e){ 
            System.out.println(e.getMessage());
        }
        finally{
        sc.close();
        System.out.println("Connection is closed");
        }
    }      

}