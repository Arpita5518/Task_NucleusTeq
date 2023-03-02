//Write a program to check valid i/p pin num. format – ex. 443 122
import java.util.Scanner;
public class ValidInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter input PIN: ");
    String pin = sc.nextLine();
    pin = pin.replaceAll(" ", "");
    boolean isValid = true;
    if (pin.length() != 6) {
      isValid = false;
    } else {
      for (int i = 0; i < pin.length(); i++) {
        char c = pin.charAt(i);
        if (!Character.isDigit(c)) {
          isValid = false;
          break;
        }
      }
    }
    if (isValid) {
      System.out.println("The input PIN number is valid.");
    } else {
      System.out.println("The input PIN number is not valid.");
    }
  }
}
