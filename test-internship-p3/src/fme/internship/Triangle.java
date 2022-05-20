package fme.internship;

public class Triangle extends Shape {

    private double side1 = 3.0;
    private double side2 = 4.0;
    private double side3 = 5.0;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double getArea() {
        return (side1 + side2 + side3) / 2;
    }

    @Override
    double getPerimeter() {

        return side1 + side2 + side3;
    }
}
