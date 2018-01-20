public class FInterface {
    public static void main(String[] args) {
        
        if (((java.util.function.Predicate<Integer>)( s -> {
            if (s == 99)
                return true;
            else
                return false;
        })).test(99)) {
            System.out.println("This will run in Java 8");
        }

        
        ((java.util.function.Consumer<String>)(s -> System.out.println("Hello " + s))).accept("World");
    }
}