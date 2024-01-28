abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    public double width;
    public double lenght;

    Rectangle(double width, double lenght) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double area() {
        return lenght * width;
    }
}

class Triangle extends Shape {
    public double base;
    public double height;

    Triangle(double base, double height) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return height * base;
    }
}

class Circle extends Shape {
    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}

public class AbstractShape {

    public static void main(String args[]) {
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(1.2, 3.2);
        Triangle triangle = new Triangle(5.5, 4.5);

        System.out.println("Area of Rectangle is  : " + rectangle.area());
        System.out.println("Area of Triangle is  : " + triangle.area());
        System.out.println("Area of Circle is  : " + circle.area());
    }
}