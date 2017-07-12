import java.util.function.Consumer;
import java.util.function.Predicate;

public class FInterface {
    public static void main(String[] args) {

        Predicate<Integer> fii = s -> {
            if (s == 99)
                return true;
            else
                return false;
        };
        Consumer<String> gii = s -> System.out.println("hello " + s);

        if (fii.test(99)) {
            System.out.println("this is running");
        }

        gii.accept("suriyan");
    }
}