package classesAndObjects;

public class ThisConstructor {
    private int x, y;
    private int width, height;

    public ThisConstructor() {
        this(0, 0, 1, 1);
    }

    public ThisConstructor(int width, int height) {
        this(0, 0, width, height);
    }

    public ThisConstructor(int x, int y, int width, int height) {
        this.x = x;
        this.y =y;
        this.width = width;
        this.height = height;
    }
}
