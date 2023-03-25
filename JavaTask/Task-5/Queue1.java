import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/*
reverse First k element of Queue
i/p : 5 (no. of inputs)
1,2,3,4,5
4( no. of elements to reverse)
o/p :
4,3,2,1,5
 */
public class Queue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++)
        q.offer(sc.nextInt());
        System.out.print("Enter no. of elements to reverse : ");
        int k = sc.nextInt();
        if(k<n){
            Stack <Integer> st = new Stack<>();
            for(int i=0; i<k; i++)
            st.push(q.poll());
            while(!st.isEmpty())
            q.offer(st.pop());
            for(int i=0; i<n-k; i++)
            q.offer(q.poll());
        }
        else{
            System.out.println(" k is not greater than n");
        }
        for(int element : q){
        System.out.print(element + " ");
        }
        
        sc.close();
    }
    
}
