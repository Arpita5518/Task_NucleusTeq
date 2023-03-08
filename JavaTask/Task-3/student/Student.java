/*Write a class Student having following properties and methods:
Property: rollNumber, name, course, marks1, marks2, marks3
Methods: calculateTotal(), calculateAverage(), calculateGrade()
*/
//Store the student file in a package student;
package student;
public class Student{
    private int rollNumber;
    private String name;
    private String course;
    private double marks1, marks2, marks3;
    public Student(int rollNumber, String name, String course, double marks1, double marks2, double marks3){
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
