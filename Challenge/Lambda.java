public class Lambda {
    public static void main(String[] args) {

        SomeX sp =  x -> System.out.println("Hi " + x);

        sp.printThis("Manoj");
    }

    interface SomeX {
        void printThis(String str);
    }
}