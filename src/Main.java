import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("Математика");
        subjects.add("Физика");
        subjects.add("Информатика");

        subjects.add(0, "Английский");
        subjects.remove("Физика");

        for (String subject : subjects) {
            System.out.println(subject);
        }
    }
}