package shapes;

public class Square extends Quadrilateral {

    public Square(double side){
        super(side, side);
    }

    @Override
    public double getPerimeter(){
        return this.length * 4;
    }

    @Override
    public double getArea(){
        return this.length * this.width;
    }


    @Override
    public double setLength(){
        return length;
    }

    @Override
    public double setWidth(){
        return width;
    }

}
