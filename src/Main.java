import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(10, 15, 20, 25, 30);
        List<String> report = readings.stream()
                .filter(n -> n % 10 == 0)
                .peek(n -> System.out.println("Значение " + n + " прошло проверку"))
                .map(String::valueOf)
                .collect(Collectors.toList());

        System.out.println(report);
    }
}