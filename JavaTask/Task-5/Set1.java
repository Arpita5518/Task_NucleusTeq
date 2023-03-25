import java.util.HashSet;
import java.util.Scanner;
/*
WAP to store only unique elements of array.
i/p int[] arr = {1,2,3,1,2,3,3,3,3}
o/p set= (1,2,3)
 */
public class Set1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of element : ");
        int n = sc.nextInt();
        System.out.println("Enter Element : ");
        for(int i=0; i<n; i++)
        set.add(sc.nextInt());
        for(int element : set )
        System.out.print(element + " ");
        sc.close();
    }
}
