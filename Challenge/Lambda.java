public class Lambda {
    public static void main(String[] args) {
<<<<<<< HEAD
        ((SomeX)x -> System.out.println("Hi " + x)).printThis("Manoj");
=======

        SomeX sp = x -> System.out.println("Hi " + x);

        sp.printThis("Manoj");
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
    }

    interface SomeX {
        void printThis(String str);
    }
}