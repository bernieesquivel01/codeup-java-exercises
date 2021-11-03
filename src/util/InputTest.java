package util;

public class InputTest {

    public static void main(String[] args) {
        System.out.println("Follow the instructions carefully!");

        Input input = new Input();

        System.out.println(input.getString());
        System.out.println(input.yesNo("Would you like to make another circle?"));
        System.out.println(input.getInt(1, 50));
        System.out.println(input.getDouble(50,100));

    }
}
