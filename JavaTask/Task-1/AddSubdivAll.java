//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
import java.util.Scanner;
class Calc{
    public int add(int num1, int num2){
        return num1+num2;
    }
    public int mul(int num1, int num2){
        return num1*num2;
    }
    public int div(int num1, int num2){
        return num1/num2;
    }
    public int rem(int num1, int num2){
        return num1%num2;
    }
}

public class AddSubdivAll{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter First Number :");
       int num1 = sc.nextInt();
       System.out.println("Enter Second Number :");
       int num2 = sc.nextInt();
       Calc cal = new Calc();
        System.out.println("Addition of Two Number :"+cal.add(num1, num2));
        System.out.println("Multiplication of Two Number :"+cal.mul(num1,num2));
        System.out.println("Divition of Two Number :"+cal.div(num1,num2));
        System.out.println("remainder of Two Number :"+cal.rem(num1,num2));
        sc.close();
    }
}