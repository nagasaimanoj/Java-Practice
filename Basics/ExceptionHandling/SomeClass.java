public class SomeClass {
    public static void main(String[] args) {
        try {
            new SomeOtherClass().runThis();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}