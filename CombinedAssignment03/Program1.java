package CombinedAssignment03;

abstract class Shape{
    double area;
    int volume;
    int surfaceArea;
    int dimensions;
    abstract void calcArea();
    void showArea(){
        System.out.println(area);
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void calcArea() {
         area = length * breadth;
    }
}
class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    void calcArea() {
        area = 3.14 * radius * radius;
    }
}

public class Program1 {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        circle.calcArea();
        circle.showArea();
        Rectangle rectangle = new Rectangle(12, 5);
        rectangle.calcArea();
        rectangle.showArea();
    }
}
