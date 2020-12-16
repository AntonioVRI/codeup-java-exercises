package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double setLength(){
        return length;
    }

    @Override
    double setWidth(){
        return width;
    }

    @Override
    public double getPerimeter(){
        return length * width;
    }

    @Override
    public double getArea(){
        return (length * 2) + (width * 2);
    }


//    protected double length;
//    protected double width;
//
//    public Rectangle(){
//    }
//
//    public Rectangle(double sides){
//        this.length = sides;
//        this.width = sides;
//    }
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }
//
//    public double getArea() {
//        return this.width * this.length;
//    }

}
