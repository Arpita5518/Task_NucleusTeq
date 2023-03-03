/*Write a class Student having following properties and methods:
Property: rollNumber, name, course, marks1, marks2, marks3
Methods: calculateTotal(), calculateAverage(), calculateGrade()
*/
class Student{
    int rollNumber;
    String name;
    String course;
    double marks1, marks2, marks3;
    Student(int rollNumber, String name, String course, double marks1, double marks2, double marks3){
        this.rollNumber=rollNumber;
        this.name=name;
        this.course=course;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    public double calculateTotal(){
      return marks1+marks2+marks3;
    }
    public double calculateAverage(){
      return calculateTotal()/3;
    }
    public String calculateGrade(){
        double avg = calculateAverage();
        if (avg >= 90) {
          return "A+";
        } else if (avg >= 80) {
          return "A";
        } else if (avg >= 70) {
          return "B";
        } else if (avg >= 60) {
          return "C";
        } else if (avg >= 50) {
          return "D";
        } else {
          return "F";
        }
      }
    //Create getter and setter methods.
    public int getrollNumber(){
        return rollNumber;
    }
    public void setrollNumber(int rollNumber){
        this.rollNumber=rollNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public double getMarks1(){
        return marks1;
    }
    public void setMarks1(double marks1){
        this.marks1=marks1;
    }
    public double getMarks2(){
        return marks2;
    }
    public void setMarks2(double marks2){
        this.marks2=marks2;
    }
    public double getMarks3(){
        return marks3;
    }
    public void setMarks3(double marks3){
        this.marks3=marks3;
    }
//Implement toString method to display details of each student.
public String toString(){
     return "Roll Number :" +rollNumber +"\nName :" + name + "\nCourse :" + course +"\nMarks1 :" + marks1 +"\nMarks2 :" + marks2+"\nMarks3 :" + marks3 +"\nGrade : "+ calculateGrade(); 
}

    
}
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
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
        System.out.println(obj4.toString());
        System.out.println(obj5.toString());
    }
}