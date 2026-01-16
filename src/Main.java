import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "apricot", "cherry", "avocado");
        List<Integer> lengths = items.stream()
                .filter(n -> n.startsWith("a"))
                .map(n -> n.length())
                .collect(Collectors.toList());

        System.out.println(lengths);
    }
}