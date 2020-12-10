package util;

public class InputTest {

    public static void main(String[] args) {

//        instantiated util.Input
        Input text = new Input();

//        call 'text' and 'getString'
        text.getString();
        System.out.println(text.yesNo());

        text.getInt();
        System.out.println(text.getInt());

        text.getDouble();
        System.out.println(text.getDouble());
    }
}
