public class DoubleColonTest {

    interface MyInterface {
        public void interfaceMethod(String input);
    }

    public static void staticmethod(String input) {
        System.out.println(" static mymethod  " + input);
    }

    public void method1(String input) {
        System.out.println(" mymethod  " + input);
    }

    public static void main(String[] args) {
        (new DoubleColonTest()::method1).interfaceMethod(" test string ");
        (DoubleColonTest::staticmethod).interfaceMethod(" test static string ");
    }
}