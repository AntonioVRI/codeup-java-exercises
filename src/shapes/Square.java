package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        System.out.println("Testing Perimeter . . .");
        return this.length * 4;
    }

    @Override
    public double getArea() {
        System.out.println("Testing Area . . .");
        return this.width * this.length;
    }

}
