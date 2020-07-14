package Part1;

public class Practice1 {
    
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3.5, 4.0);
        System.out.println(triangle.getArea());
        
    }

}

class Triangle {

    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base * height * 0.5;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}