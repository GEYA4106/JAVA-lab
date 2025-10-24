abstract class Shape{
    abstract double area();
}

class Rectangle extends Shape{
    double length,width;
    Rectangle(double l,double w){
        length=l;
        width=w;
    }
    double area(){
        return length * width;
    }
}

class Circle extends Shape{
    double radius;
    Circle(double r){
        radius=r;
    }
    double area(){
        return Math.PI * radius * radius;
    }
}



public class Abstract{
    public static void main(String[] args){
        Shape rect = new Rectangle(10,5);
        Shape circle = new Circle(6);
        System.out.println("area of rectangle is:" +rect.area());
        System.out.println("area of circle is:" +circle.area());
    }
}
