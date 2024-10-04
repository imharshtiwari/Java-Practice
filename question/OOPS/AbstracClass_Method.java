import static java.lang.Math.PI;
/*
 Problem Statement:
Define an abstract class Shape with an abstract method area(). Create concrete subclasses like Circle and Rectangle, and implement the area() method.
For Circle, the area is π * r²
For Rectangle, the area is length * width
 */
abstract class Shape{
   abstract double area();
   abstract double parameter();
     // Abstract method
     // To be implemented in subclasses..
}
class Circle extends Shape{
    private double radius;
    //COnstructor 
    Circle(double radius){
        this.radius = radius;
    }
    @Override     //Overrried becoz of same method name ssame,name,signuature
        double area(){
            return PI * radius * radius;   // π * r²
        }
        // Implementing area() method for Circle class
    @Override
             double parameter(){
                return 2 * PI * radius;     // 2πr
            }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    //Constructor
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
        double area(){
            return length * width;         // length * width
        }
        @Override
        double parameter(){
            return 2 * (length + width);   // 2(length + width)
        }
}
public class AbstracClass_Method {
    public static void main(String[] args) {
    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4, 6);
    System.out.println("Area of Circle: " + circle.area());
    System.out.println("Parameter of Circle: " + circle.parameter());
    System.out.println("Area of Rectangle: " + rectangle.area());
    System.out.println("Parameter of Rectangle: " + rectangle.parameter());

    }
    
}
