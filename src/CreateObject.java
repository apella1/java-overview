public class CreateObject {
    public static void main(String[] args) {
        Point originOne = new Point(23, 3);
        Rectangle firstRectangle = new  Rectangle(originOne, 100, 200);
        Rectangle secondRectangle = new Rectangle(60, 80);

        System.out.println(firstRectangle.height);
        System.out.println(firstRectangle.width);
        System.out.println("Rectangle 2 Area: " + secondRectangle.getArea());
        System.out.println(secondRectangle.origin);
        secondRectangle.origin = originOne;
        System.out.println(secondRectangle.origin.y);
        firstRectangle.move(23, 23);
        System.out.println(firstRectangle.origin.x);
    }

}


class Point {
    public int x = 0;
    public int y = 0;

    // a constructor!
    public Point(int a, int b) {
        x = a;
        y = b;
    }
}

class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public Rectangle() {
        origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
        origin = p;
    }
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing the area of the rectangle
    public int getArea() {
        return width * height;
    }
}
