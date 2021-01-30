package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Square(5);
        Measurable myShape2 = new Rectangle(4, 5);
        System.out.println("The Perimeter of my shape is: " + myShape.getPerimeter());
        System.out.println("The Area of my shape is: " + myShape.getArea());

        System.out.println("The Perimeter of my shape #2 is: " + myShape2.getPerimeter());
        System.out.println("The Area of my shape #2 is: " + myShape2.getArea());

//        Rectangle box1 = new Rectangle(5.0, 4.0);
//        Rectangle box2 = new Square(5.0);
//
////        test methods for box1
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
////        test methods for box2
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

    }
}
