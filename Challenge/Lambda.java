public class Lambda {
    public static void main(String[] args) {
        ((SomeX)x -> System.out.println("Hi " + x)).printThis("Manoj");
    }

    interface SomeX {
        void printThis(String str);
    }
}