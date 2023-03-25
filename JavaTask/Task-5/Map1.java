import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
WAP to count frequency of give list of digit and alphabet in string .
i/p {1,1,2,2} --> 1= 2, 2=2
believe in yourself --> e=4 , b=1 etc
 */
public class Map1 {
    public static void main(String[] args) {
        HashMap <Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements");
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            int element = sc.nextInt();
            map.put(element, map.getOrDefault(element,0)+1);
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
          
            System.out.print(m.getKey() + " " + m.getValue());
            System.out.println();
        }
        sc.close();
    }
    
}
