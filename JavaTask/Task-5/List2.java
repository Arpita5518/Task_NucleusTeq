import java.util.ArrayList;
import java.util.Scanner;
/*
2. create a menu program with following options .
1. add 2.remove 3.display element 4.exit
program should run until user choose 4th option.
 */
public class List2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        List2Method list2 = new List2Method();
        while(true){
        System.out.println("1. Add Element in ArrayList : ");
        System.out.println("2. Remove Element from ArrayList : ");
        System.out.println("3. Display Element of ArrayList : ");
        System.out.println("4. exit : ");
        System.out.print("Enter Your Choice : ");
        int choice = sc.nextInt();       
        switch(choice){
            case 1 : list2.addElement(sc, list);
                     break;
            case 2 : list2.removeElement(sc, list);
                     break;
            case 3 : list2.displayElement(list);
                     break;
            case 4 : System.exit(0);
                     break;
            default : System.out.println("Invalid choice");
        }
        sc.close();
    }
  }
}
