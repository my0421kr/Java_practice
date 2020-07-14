package Part2;

public class Practice1 {
    
    public static void main(String[] args) {
        
        double radius1 = 3.5;
        double radius2 = 4.3;

        System.out.println(areaCircle(radius1));
        System.out.println(lenCircle(radius2));

    }

    public static double areaCircle(double radius) {

        final double CONST_PI = 3.14;
        double result = radius * radius * CONST_PI;
        return result;

    }

    public static double lenCircle(double radius) {

        final double CONST_PI = 3.14;
        double result = 2 * radius * CONST_PI;
        return result;

    }

}