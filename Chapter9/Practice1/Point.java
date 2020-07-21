class Point {
    int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void showPointInfo() {
        System.out.println("[" + xPos + ", " + yPos + "]");
    }

    public static void main(String[] args) {
        Circle c = new Circle(2, 2, 4);
        c.showCircleInfo();
    }
}

class Circle {
    Point pos;
    int rad;

    public Circle(int x, int y, int rad) {
        pos = new Point(x, y);
        this.rad = rad;
    }

    public void showCircleInfo() {
        pos.showPointInfo();
        System.out.println("[" + rad + "]");
    }
}
