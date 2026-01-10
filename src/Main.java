import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(8);
        Shape circle = new Circle(6);

        System.out.println(square.calculateSurface());
        System.out.println(circle.calculateSurface());
    }
}

abstract class Shape {
    abstract double calculateSurface();
}

class Square extends Shape {
    double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateSurface() {
        return sideLength * sideLength;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSurface() {
        return Math.PI * radius * radius;
    }
}