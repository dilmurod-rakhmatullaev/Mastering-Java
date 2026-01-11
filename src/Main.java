import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> cinemaName = new ArrayList<>();

        cinemaName.add("Титаник");
        cinemaName.add("Матрица");
        cinemaName.add("Интерстеллар");
        cinemaName.add("Матрица");

        System.out.println(cinemaName.indexOf("Матрица") + 1);
        System.out.println(cinemaName.contains("Аватар"));
        cinemaName.clear();

        System.out.println(cinemaName);
    }
}