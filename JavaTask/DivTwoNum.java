//Write a Java program to divide two numbers and print on the screen.
import java.util.Scanner;
public class DivTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 =scanner.nextInt();
        System.out.println("Division of Two Num : " +(num1/num2));
        
    }
}
