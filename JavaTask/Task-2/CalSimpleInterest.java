//write a program to calculate Simple interest and compound interest
import java.util.Scanner;
public class CalSimpleInterest {
    public static void main(String[] args) {   
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter principal: ");
    double principal = sc.nextDouble();  
    System.out.print("Enter interest: ");
    double rate = sc.nextDouble();  
    System.out.print("Enter the time: ");
    double time = sc.nextDouble();  
    double simpleInterest = (principal * rate * time) / 100;
    double compoundInterest = principal * Math.pow((1 + rate/100), time) - principal;
    System.out.println("Simple interest = " + simpleInterest);
    System.out.println("Compound interest = " + compoundInterest);
    sc.close();
  }
}
