import java.util.ArrayList;
import java.util.List;

public class UpperboundWildCard {
    public static double sumOfNumber(List <? extends Number> list){
        double sum=0;
        for(Number num : list)
        sum+=num.doubleValue();
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(12);
        intList.add(5);
        System.out.println("Sum of Integer Number is : " + sumOfNumber(intList));
        List<Double> nList = new ArrayList<>();
        nList.add(12.9);
        nList.add(5.7);
        System.out.println("Sum of Number is : " + sumOfNumber(nList));
        
    }
    
}
