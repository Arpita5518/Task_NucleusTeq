import student.Student;
import java.util.Scanner;
import java.util.HashSet;
//Create class StudentTest with main method for calling Student class.
public class StudentTest{
    public static void main(String[] args) {
//StudentTest should contain atleast 5 student objects with different grades.
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[1];
        HashSet <String> set = new HashSet<>();
        String rollNumber;
        for(int i=0; i<student.length; i++){
            do {
                rollNumber = Integer.toHexString((int)(Math.random()*10000));
                if(!set.contains(rollNumber)){set.add(rollNumber); break;
                }
            } while (true);      
        System.out.print("Enter Student Name :");
        String name = sc.nextLine(); 
        System.out.print("Enter Student Course :");
        String course =sc.nextLine();
        System.out.println("Enter student marks :");
        double marks1 = sc.nextDouble();
        double marks2 = sc.nextDouble();
        double marks3 = sc.nextDouble();
        student [i] = new Student(rollNumber, name, course, marks1, marks2, marks3);
        }

//use toString() method to print the student details.
//Also display grades of each student.
        for(int i=0; i<student.length; i++){
            System.out.println(student[i]);
        }
        sc.close();
    }
}
