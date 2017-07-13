import java.lang.Iterable;
import java.util.Arrays;
//import java.util.stream.Stream;

public class HowForEachWorks2 {
    public static void main(String[] args) {
        Arrays.asList("Micky", "Donald", "Minnie", "Aurora", "Winnie", "Pluto").forEach(System.out::println);
        //Stream.of("Micky", "Donald", "Minnie", "Aurora", "Winnie", "Pluto").forEach(System.out::println);
    }
}