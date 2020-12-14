package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5.0, 4.0);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5.0);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        Square box3 = new Square(6.0);
        System.out.println(box3.getPerimeter());
        System.out.println(box3.getArea());

    }
}
