import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();

        names.add("Борис");
        names.add("Алексей");
        names.add("Виктор");

        System.out.println(names);
    }
}