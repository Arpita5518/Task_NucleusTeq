//Write a Java program that takes two numbers as input and display the product of two numbers.
import java.util.Scanner;
public class MulTwoNum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter First Number :");
       int num1 = sc.nextInt();
       System.out.println("Enter Second Number :");
       int num2 = sc.nextInt();
       System.out.println("Multiplication of Two Number :" +(num1*num2)); 
    }
}
