package lambda;

public class MessageTest {
    public static void main(String[] args) {
        IMessage im = str -> System.out.println("hello " + str);
        im.test("world");
    }
}
