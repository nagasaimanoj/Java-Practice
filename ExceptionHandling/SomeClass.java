public class SomeClass {
    int i = 0;

    public static void main(String[] args) throws Exception {
        div();
    }

    static void div() throws Exception {
        int a = 5, b = 0;
        if (b == 0) {
            throw new Exception("this is naga sai");
        }
        int ddd = a / b;
    }
}