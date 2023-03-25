/*
 List –
1. WAP(write a program) to store only unique elements in arraylist .
e.g list - [1,2,1,2,1,2,1,2,1]
o/p list- [1,2]
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class List1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Set <Integer> set = new HashSet<>();
        System.out.print("Enter no. of Elements to Enter : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
        int element = sc.nextInt();
        list.add(element); 
        set.add(element);
        }
        System.out.println("ArrayList Element are : ");
        for(int element : list)
        System.out.print(element + " ");
        System.out.println();
        System.out.println("HashSet Element are : ");
        for(int element : set)      
        System.out.print(element + " ");
        sc.close();

         
    }
}