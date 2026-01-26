import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> animals = List.of("кота", null, "собаку");
        } catch (NullPointerException e) {
            System.out.println("Null запрещён: NullPointerException");
        }

        try {
            Set<String> objects = Set.of("солнце", "луну", "солнце");
        } catch (IllegalArgumentException ex) {
            System.out.println("Дубликаты запрещены: IllegalArgumentException");
        }
    }
}