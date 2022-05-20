package fme.internship;

public class Rectangle  extends Shape{
    private double width;
    private double lenght;

    public Rectangle() {
        this.lenght=3.0;
        this.width=4.0;

    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }


    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return width*lenght;
    }

    public double getPerimeter(){
        return 2*(width+lenght);
    }


}
