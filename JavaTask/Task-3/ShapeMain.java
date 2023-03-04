/*
Create an abstract class Shape having no properties and two
abstract method perimeter() and area().
Create two concrete class Circle and Rectangle which extends
abstract class Shape and override the abstract method
Perimeter() and area().
Display perimeter and area of circle and rectangle.
 */
abstract class Shape{
    abstract double perimeter();
    abstract double area();
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    double perimeter() {
       return 2*Math.PI*radius;
    }
    double area(){
       return Math.PI*radius*radius;
    }
    
}
class Rectangle extends Shape{
    double length, width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    double perimeter() {
      return 2*(length+width); 
    }
    double area(){
       return length*width;
    }
}
public class ShapeMain{
        public static void main(String[] args) {
            Circle circle = new Circle(4);
            System.out.println("Circle Perimeter :" + circle.perimeter());
            System.out.println("Circle Area :" + circle.area());
            Rectangle rec = new Rectangle(5, 4);
            System.out.println("Rectangle Perimeter :" + rec.perimeter());
            System.out.println("Rectangle Area :" + rec.area());
        }
}