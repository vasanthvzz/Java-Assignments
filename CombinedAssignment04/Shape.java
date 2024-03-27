package CombinedAssignment04;

abstract public class Shape  {
    double area;
    double perimeter;
    abstract void calcArea();
    abstract void calcPerimeter();
}

class Rectangle extends Shape{
    int length;
    int breadth;
    void calcArea(){
        area = length*breadth;
        System.out.println("Area : "+area);
    }
    void calcPerimeter(){
        area = 2*(length+breadth);
    }
    public static void main(String[] args) {
        System.out.println("hi");
    }
}

class Square extends Shape{
    int side;
    void calcArea(){
        area = side*side;
        System.out.println("Area : "+area);
    }
    void calcPerimeter(){
        perimeter = 4*side;
    }
}
class Circle extends Shape{
    int radius;
    void calcArea(){
        area = 3.14*radius*radius;
    }
    void calcPerimeter(){
        perimeter = 2 * 3.14 * radius;
    }
}



