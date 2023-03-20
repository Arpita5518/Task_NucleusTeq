import java.util.Arrays;
import java.util.List;

public class LowerboundWildCard {
        public static void addNumbers(List<? super Integer> list) {  
            for(Object n:list)   
                  System.out.println(n);   
        } 
    public static void main(String[] args) {  
          
        List<Integer> l1=Arrays.asList(5,7);  
        System.out.println("Integer values :");  
        addNumbers(l1);  
          
        List<Number> l2=Arrays.asList(12.7,5.6);  
        System.out.println("Number values :");  
        addNumbers(l2);  
    
    }
}
