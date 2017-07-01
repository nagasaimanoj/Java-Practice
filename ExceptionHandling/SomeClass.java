public class SomeClass {

    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}