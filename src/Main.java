import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> magicWords = List.of("Java", "Stream", "API");
        String spell = magicWords.stream()
                .collect(Collectors.joining(" "));
        System.out.println(spell);
    }
}