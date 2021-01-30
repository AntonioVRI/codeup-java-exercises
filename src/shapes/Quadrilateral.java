package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;
    protected double side;

    // constructor here
    public Quadrilateral(){
    }
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    // public methods
    public double getLength(double length) {
        return this.length;
    }

    public double getWidth(double width){
        return this.width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

    public double getArea(){
        return length * width;
    }

    abstract double setLength();
    abstract double setWidth();
}
