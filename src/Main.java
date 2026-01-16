import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> readings = List.of(3, 7, 2, 9, 4, 6, 8, 5);
        List<String> oddLabels = readings.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> "Odd: " + n)
                .collect(Collectors.toList());

        System.out.println(oddLabels);
    }
}