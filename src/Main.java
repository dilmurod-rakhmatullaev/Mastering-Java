import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> students = List.of(
                "Анна", "Борис", "Алексей", "Мария", "Андрей", "Виктор", "Артур", "Галина", "Алиса", "Дмитрий"
        );
        students.stream()
                .filter(n -> n.startsWith("А"))
                .forEach(System.out::println);
    }
}