package fme.internship;

public class Circle extends Shape{
    private double radius;
    public Circle(){
        this.radius=2;

    }

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return(" A circle with radius"+radius+" "+super.toString());

    }
}
