//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;
public class AvgThreeNum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter First No. :");
       int num1 = sc.nextInt();
       System.out.println("Enter Second No. :");
       int num2 = sc.nextInt(); 
       System.out.println("Enter Third Number :");
       int num3 = sc.nextInt();
       System.out.println("Average of three Number :" +(num1+num2+num3)/3);
       sc.close();
    }
}
