import java.util.Arrays;
import java.util.List;

class HowForEachWorks {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Micky", "Donald", "Minnie", "Aurora", "Winnie", "Pluto");

        items.forEach(x -> System.out.println(x));
    }
}