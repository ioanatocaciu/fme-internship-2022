package fme.internship;

public class Square extends Rectangle {

public double side=4;

    @Override
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}