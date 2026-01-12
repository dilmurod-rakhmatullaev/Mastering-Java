import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> languages = new HashSet<>();

        languages.add("java");
        languages.add("python");
        languages.add("c++");
        languages.add("javascript");

        Iterator<String> it = languages.iterator();
        while (it.hasNext()) {
            String line = it.next();
            if (line.contains("+")) {
                it.remove();
            }
        }

        for (String language : languages) {
            System.out.println(language);
        }
    }
}