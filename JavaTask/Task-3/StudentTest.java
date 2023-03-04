import student.Student;
//Create class StudentTest with main method for calling Student class.
public class StudentTest{
    public static void main(String[] args) {
//StudentTest should contain atleast 5 student objects with different grades.
        Student obj1 = new Student(1, "Arpita", "Computer Science", 90, 87, 92);
        Student obj2 = new Student(2, "Mansi", "English", 93, 97, 88);     
        Student obj3 = new Student(3, "Akanksha", "Korean", 91, 87, 72);
        Student obj4 = new Student(4, "Laxmi", "Science", 80, 77, 99);
        Student obj5 = new Student(5, "Poonam", "Maths", 89, 88, 90);
//use toString() method to print the student details.
//Also display grades of each student.
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);
    }
}