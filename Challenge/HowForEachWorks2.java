public class HowForEachWorks2 {
    public static void main(String[] args) {
        java.util.stream.Stream.of("Micky", "Donald", "Minnie", "Aurora", "Winnie", "Pluto").forEach(System.out::println);
    }
}