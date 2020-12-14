package shapes;

public class Rectangle {
//
    protected double length;
    protected double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public double getArea() {
        return this.width * this.length;
    }

}
