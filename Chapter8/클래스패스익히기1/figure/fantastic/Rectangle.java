package figure.fantastic;

public class Rectangle {
    double wide;
    double height;

    public Rectangle(double wide, double height) {
        this.wide = wide;
        this.height = height;
    }

    public double getArea() {
        return wide * height;
    }
}