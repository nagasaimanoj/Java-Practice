public class Lambda {
    public static void main(String[] args) {

        SomeX sp = (String x) -> System.out.println("hi " + x);

        sp.printThis("manoj");
    }

    interface SomeX {
        void printThis(String str);
    }
}