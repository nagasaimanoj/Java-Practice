public class DoubleColonTest {

    public static void staticmethod(String input) {
        System.out.println(" static mymethod  " + input);
    }

    public static void main(String[] args) {
        (new DoubleColonTest()::method1).interfaceMethod(" test string ");
        (DoubleColonTest::staticmethod).interfaceMethod(" test static string ");
    }
<<<<<<< HEAD
=======

    public void method1(String input) {
        System.out.println(" mymethod  " + input);
    }

    interface MyInterface {
        public void interfaceMethod(String input);
    }

>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
}