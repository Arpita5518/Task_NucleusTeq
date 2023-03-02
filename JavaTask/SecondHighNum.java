//write a program to search 2nd highest number from an array .
public class SecondHighNum {
  public static void main(String[] args) {  
    int[] numbers = {6, 12, 5, 21, 17, 9, 8};
    int highest = Integer.MIN_VALUE;
    int secondHighest = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      int currNumber = numbers[i];
      if (currNumber > highest) {
        secondHighest = highest;
        highest = currNumber;
      } else if (currNumber > secondHighest && currNumber != highest) {
        secondHighest = currNumber;
      }
    }
      System.out.println("The second highest number in the array is: " + secondHighest);
  }
}
