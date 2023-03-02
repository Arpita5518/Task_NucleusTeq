//Write a program to convert currency in respective country value . (switch case)Eg – i/p X rs o/p Y$
import java.util.Scanner;
public class ConvertCurrency {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the amount in Indian Rupees: ");
    double rupees = sc.nextDouble();
    System.out.print("Enter Equivalent Choice : ");
    int choice = sc.nextInt();
    double dollars, euro, won;
    switch (choice) {
      case 1:
        // Convert to US Dollars
        dollars = rupees / 74.5;
        System.out.println("Amount in US Dollars:" + dollars);
        break;
      case 2:
        // Convert to Euro
        euro = rupees / 89.2;
        System.out.println("Amount in Euro:" + euro);
        break;
      case 3:
        // Convert to South Korean Won
        won = rupees * 1000 / 74.5;
        System.out.println("Amount in South Korean Won:" + won);
        break;
        default:
        System.out.println("Invalid input..");
    }
  }
}
