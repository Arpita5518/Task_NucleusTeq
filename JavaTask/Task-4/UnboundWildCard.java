import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundWildCard {
    public static void  printList(List <?> list){
        for(Object num : list)
        System.out.println(num);
    }
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(12);
        intList.add(5);
        printList(intList);
        List<Double> nList = Arrays.asList(12.9,5.7);
        printList(nList);
        List<String> sList = Arrays.asList("Hey", "There!");
        printList(sList);
    }
    
}
