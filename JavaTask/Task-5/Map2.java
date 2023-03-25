import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
//believe in yourself --> e=4 , b=1 etc
public class Map2 {
    public static void main(String[] args) {
        HashMap <Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String line = sc.nextLine();
        for(int i=0; i<line.length(); i++){
            char ch = line.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Entry<Character, Integer> m : map.entrySet()){
            System.out.print(m.getKey() + " " + m.getValue());
            System.out.println();
        }
        sc.close();
    }
}
