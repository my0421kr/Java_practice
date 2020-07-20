package figure.nice;

public class Rectangle {
    double wide;
    double height;

    public Rectangle(double wide, double height) {
        this.wide = wide;
        this.height = height;
    }

    public double getLength() {
        return (wide + height) * 2;
    }
}