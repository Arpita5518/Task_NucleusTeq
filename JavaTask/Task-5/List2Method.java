import java.util.ArrayList;
import java.util.Scanner;

public class List2Method {
    public void addElement(Scanner sc, ArrayList<Integer> list){
    System.out.print("Enter no. of elements to insert : ");
    int n = sc.nextInt();
    System.out.print("Enter Element : ");
    for(int i=0; i<n; i++)
    list.add(sc.nextInt());
    }

    public void removeElement(Scanner sc, ArrayList<Integer> list){
    System.out.print("Enter Element to remove : ");
    int element = sc.nextInt(); 
    if(list.contains(element))
    list.remove(Integer.valueOf(element));
    else
    System.out.println("Element not exist.");
    }
    public void displayElement(ArrayList<Integer> list){
      for(int element : list)
      System.out.print(element +" ");
      System.out.println();
    }
}
