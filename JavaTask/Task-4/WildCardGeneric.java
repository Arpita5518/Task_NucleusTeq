import java.util.ArrayList;
import java.util.List;

public class WildCardGeneric {
    public static void printList(List <?> list)
       {
        System.out.println(list);
       }    
        public static void main(String[] args) {
            List<Integer> list1 = new ArrayList<>();
            List<Double> list2 = new ArrayList<>();
            List<String> list3 = new ArrayList<>();
            list1.add(1); 
            list1.add(2); 
            list1.add(3);
            list2.add(1.0); 
            list2.add(2.0); 
            list2.add(3.0);
            list3.add("Arpita");
            list3.add("Mansi");
            list3.add("Akansha"); 
            printList(list1);
            printList(list2);  
            printList(list3);     
    }
}
