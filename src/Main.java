import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> categories = Arrays.asList("java", "stream", "api");
        List<String> uppercased = categories.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercased);
    }
}