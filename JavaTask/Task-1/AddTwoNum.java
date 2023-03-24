import java.util.Scanner;

//Write a Java program to print the sum of two numbers
public class AddTwoNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter Number : ");
            int num2 =sc.nextInt();
            System.out.println("Sum of Two Number is :" + (num1+num2));
            sc.close();
        }
}